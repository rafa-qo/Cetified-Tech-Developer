import React, { useEffect, useState } from 'react'
import { useNavigate } from 'react-router-dom'


const Episodes = () => {
    const [episodes, setEpisodes] = useState([])

     /* Utilizando a API History */
     const navigate = useNavigate();

    const getEpisodes = async()=>{
       const res = await fetch("https://rickandmortyapi.com/api/episode")
       const data = await res.json()
       setEpisodes(data.results)
    }
   
    useEffect(() => {
        getEpisodes()
     })
   
     return (
       <div>
           <h1>Episodes List</h1>

           <button onClick={
                () => {
                    navigate(-1);
                }
            }>{`<`}
            </button>

            <button onClick={
                () => {
                    navigate(1);
                }
            }>{`>`}
            </button>

           <table>
               <thead>
                   <th>Name</th>
                   <th>Episode</th>
                   <th>Air date</th>
               </thead>
               <tbody>

                   {episodes.length 
                    ? episodes.map(ep => (
                       <tr key={ep.id}>
                           <td>{ep.name}</td>
                           <td>{ep.episode}</td>
                           <td>{ep.air_date}</td>
                       </tr>
                    ))
                     : null
                   }
               </tbody>
           </table>
       </div>
     )
}

export default Episodes