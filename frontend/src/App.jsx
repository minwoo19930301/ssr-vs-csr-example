import { useEffect, useState } from 'react'
import GridTable from './components/GridTable'
import './App.css'

function App() {
  const [items, setItems] = useState([])
  const [loading, setLoading] = useState(true)

  useEffect(() => {
    fetch('/api/v1/grid')
      .then(res => res.json())
      .then(data => {
        setItems(data)
        setLoading(false)
      })
      .catch(err => {
        console.error('Failed to fetch data', err)
        setLoading(false)
      })
  }, [])

  return (
    <div className="container">
      <h1>📚 추천 도서 목록 (Mock Data) - React CSR</h1>
      <GridTable items={items} loading={loading} />
    </div>
  )
}

export default App
