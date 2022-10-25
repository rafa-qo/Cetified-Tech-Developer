function Container(props) {

    return(
        <div>
            {props.children || props.title}
        </div>
    )
    
}

export default Container;