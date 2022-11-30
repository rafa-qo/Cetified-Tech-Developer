import { useState, useEffect } from 'react';
import axios from "axios";
import { createServer, Model } from "miragejs";

createServer({
  models: {
    course: Model,
  },
  seeds(server) {
    server.create("course", {
      name: "Desenvolvimento Frontend",
      duration: 80,
      teacher: "Wesley"
    });
    server.create("course", {
      name: "Desenvolvimento Mobile",
      duration: 100,
      teacher: "Bruno"
    });
    server.create("course", {
      name: "Desenvolvimento FullStack",
      duration: 80,
      teacher: "Ana"
    });
  },
  routes() {
    this.namespace = "api/courses";

    this.get("/", (schema, request) => {
      return schema.courses.all();
    });

    this.get("/:id", (schema, request) => {
      let id = request.params.id;
      return schema.courses.find(id);
    });


    this.post("/", (schema, request) => {
      let attrs = JSON.parse(request.requestBody);
      return schema.courses.create(attrs);
    });

    this.put("/:id", (schema, request) => {
      let newAttrs = JSON.parse(request.requestBody);
      let id = request.params.id;
      let course = schema.courses.find(id);
      return course.update(newAttrs);
    });

    this.delete("/:id", (schema, request) => {
      let id = request.params.id;
      return schema.courses.find(id).destroy();
    });

  }
});

function App() {

  const [posts, setPosts] = useState([]);

  const [courses, setCourses] = useState([]);

  async function getDataByServer() {
    // Essa é a forma com fetch. O de baixo é com axios, mais fácil. 
    // try {
    //   const response = await fetch(
    //     "https://jsonplaceholder.typicode.com/posts"
    //   );
    //   const responseJSON = await response.json();
    //   setPosts(responseJSON);
    // } catch (error) {
    //   alert("Erro na solicitação");
    // }

    try {
      const response = await axios.get(
        "https://jsonplaceholder.typicode.com/posts"
      )
      console.log(response.data);
      setPosts(response.data.post);
    } catch (error) {
      alert("Erro na solicitação");
    }
  
  }
 

  async function newPost() {

    const post = {
      title: "teste 1",
      body: "conteúdo",
      userId: 1
    }
    try {
      const response = await axios.post(
        "https://jsonplaceholder.typicode.com/posts",
        post
      );
      alert("Post salvo com sucesso!");

    } catch (error) {
      alert("Não foi possível adicionar o post!");
    }
  }

  useEffect (()=> {
    // getDataByServer();
  }, []);


  useEffect(()=>{
    getCourses();
  }, []);

  useEffect(()=>{
    getCoursesByID();
  },[])

  async function getCourses() {
    const response = await axios.get("http://127.0.0.1:5173/api/courses");
    console.log(response.data);
    setCourses(response.data.courses);
  }

  async function getCoursesByID() {
    const response = await axios.get("http://127.0.0.1:5173/api/courses/2");
    console.log("CURSO 2: " + JSON.stringify(response.data));
  }

  async function editCourse() {

    try {
      const response = await axios.put("http://127.0.0.1:5173/api/courses/2", 
        {
          name: "Mobile 2",
          duration: 50,
          teacher: "Ana"
        }
      );
      console.log(response.data);
      alert("Alteração realizada com sucesso");
      getCourses();
    } catch (error) {
      alert("Alteração não pode ser realizada! " + error);
    }
    
  }

  async function newCourse(){
    try {
      const response = await axios.post("http://127.0.0.1:5173/api/courses", 
        { 
          name: "Design",
          duration: 70,
          teacher: "Rafael"
        }
      );
      alert("Curso salvo com sucesso!");
      getCourses();
    } catch (error) {
      alert("Não foi possível adicionar novo curso!");
    }
  }

  async function deleteCourse(){
    try {
      await axios.delete("http://127.0.0.1:5173/api/courses/2");
      alert("Curso deletado com sucesso!");
      getCourses();
    } catch (error) {
      alert("Erro ao deletar o curso: " + error);
    }
  }
  return (
    <div>
      <button onClick={newPost}>Salvar Post</button>
      <button onClick={editCourse}>Editar Curso</button>
      <button onClick={newCourse}>Adicionar Curso</button>
      <button onClick={deleteCourse}>Deletar Curso</button>
      { courses.map((course)=> (
        <div>
          <p>Curso: {course.name}</p>
          <p>Professor: {course.teacher}</p>
          <p>Duração: {course.duration}</p>
          <br />
          <br />
        </div>
      ))}
      {/* { courses.length > 0 ? JSON.stringify(courses) : "Carregando cursos..." }; */}
      {/* { posts.length > 0 ? JSON.stringify(posts) : "Carregando..." }; */}
      {/* <button onClick={getDataByServer}>Buscar Dados</button> */}

    </div>
  )
}

export default App;
