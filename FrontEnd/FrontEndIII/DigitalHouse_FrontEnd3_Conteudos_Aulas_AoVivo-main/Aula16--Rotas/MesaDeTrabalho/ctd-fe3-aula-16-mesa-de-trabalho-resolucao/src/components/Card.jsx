import React from 'react'

import { useNavigate } from "react-router-dom";


const Card = ({ data }) => {

  const navigate = useNavigate();

  return (
    //Evento de click adicionado ao card
    <div className='card' onClick={() => navigate(`/beer/${data.id}`)}>
      <h3>{data.name} ({data.id})</h3>
      <p>{data.tagline}</p>
      <img src={data.image_url} alt="beer-detail" />
    </div>
  )
}

export default Card