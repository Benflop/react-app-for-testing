import { render, screen } from '@testing-library/react';
import App from './App';

test('Check Homepage', () => {
  render(<App />);
  const linkElement = screen.getByText("MovieLand");
  expect(linkElement).toBeInTheDocument();
});
