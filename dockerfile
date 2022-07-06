FROM jenkins/jenkins:2.346.1-jdk11
USER root
RUN apt-get update && apt-get install -y lsb-release
RUN curl -fsSLo /usr/share/keyrings/docker-archive-keyring.asc \
  https://download.docker.com/linux/debian/gpg
RUN echo "deb [arch=$(dpkg --print-architecture) \
  signed-by=/usr/share/keyrings/docker-archive-keyring.asc] \
  https://download.docker.com/linux/debian \
  $(lsb_release -cs) stable" > /etc/apt/sources.list.d/docker.list
RUN apt-get update && apt-get install -y docker-ce-cli

WORKDIR /usr/app

RUN apt-get install wget -y
RUN wget https://github.com/mozilla/geckodriver/releases/download/v0.29.0/geckodriver-v0.29.0-linux64.tar.gz 
RUN tar -xvzf geckodriver-v0.29.0-linux64.tar.gz 
RUN chmod +x geckodriver 
RUN mv geckodriver /usr/local/bin/

RUN apt-get install firefox-esr -y
RUN export MOZ_HEADLESS=1

COPY . .

EXPOSE 3000

USER jenkins
