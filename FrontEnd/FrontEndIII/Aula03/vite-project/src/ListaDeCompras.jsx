function ListaCompras() {

    const itens = [
        {
            id:1,
            name: 'Coca-cola',
        },
        {
            id:2,
            name: 'Pão',
        },
        {
            id:3,
            name: 'Pizza',
        },
        {
            id:4,
            name: 'Salgadinho',
        }
    ]
    return(
        <ul> 
            {itens.map(item=><li key={item.id}>{item.id} - {item.name}</li>)}
        </ul>
    )
    
}

export default ListaCompras;