import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import Fun from './App.jsx'
import Greet from './Greet.jsx'

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <Fun></Fun>
    {/* <Fun></Fun> */}
    {/* <Fun></Fun> */}
  </StrictMode>,
)
