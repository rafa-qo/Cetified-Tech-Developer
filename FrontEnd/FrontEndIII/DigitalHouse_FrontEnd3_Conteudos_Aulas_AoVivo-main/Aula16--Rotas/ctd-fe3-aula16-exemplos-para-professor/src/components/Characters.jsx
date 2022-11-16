import React, { useEffect, useState } from 'react'
import { Link, useNavigate } from 'react-router-dom'


const Characters = () => {
    const [characters, setCharacters] = useState([])

    /* Utilizando a API History */
    const navigate = useNavigate();

    const getCharacters = async () => {
        const res = await fetch("https://rickandmortyapi.com/api/character")
        const data = await res.json()
        setCharacters(data.results)
    }

    useEffect(() => {
        getCharacters()
    })

    return (
        <div>
            <h1>Characters List</h1>

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
                <tr>
                    <th>Name</th>
                    <th>Status</th>
                    <th>Species</th>
                </tr>
                <tbody>
                    {characters.length
                        ? characters.map(ch => (
                            <tr id={ch.id}>
                                <Link to={`${ch.name}`} >
                                    <td>{ch.name}</td>
                                </Link>
                                <td>{ch.status}</td>
                                <td>{ch.species}</td>
                            </tr>
                        ))
                        : null
                    }
                </tbody>
            </table>
        </div>
    )
}

export default Characters