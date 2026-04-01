const GridRow = ({ item }) => {
  return (
    <tr>
      <td>{item.id}</td>
      <td>{item.title}</td>
      <td>{item.author}</td>
      <td className="price">{item.price.toLocaleString()}원</td>
    </tr>
  )
}

export default GridRow
