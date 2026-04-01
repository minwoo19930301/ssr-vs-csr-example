import GridRow from './GridRow'

const GridTable = ({ items, loading }) => {
  if (loading) {
    return <p style={{ textAlign: 'center' }}>데이터를 불러오는 중입니다...</p>
  }

  return (
    <table>
      <thead>
        <tr>
          <th>ID</th>
          <th>도서명</th>
          <th>저자</th>
          <th>가격</th>
        </tr>
      </thead>
      <tbody>
        {items.length === 0 ? (
          <tr>
            <td colSpan="4" className="empty-message">데이터가 존재하지 않습니다.</td>
          </tr>
        ) : (
          items.map(item => <GridRow key={item.id} item={item} />)
        )}
      </tbody>
    </table>
  )
}

export default GridTable
