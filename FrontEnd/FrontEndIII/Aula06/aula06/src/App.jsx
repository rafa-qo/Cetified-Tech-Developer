import ItemList from "./components/ItemList";
import { carros } from "./mock/carros.js";
import styles from "./styles.module.css";

function App() {

  return (
    <ul>
      <p className={styles.item_list1}>a</p>
      {
        carros.map(
          item => 
          <ItemList key={item.id} item={item}/>
        )
      }
    </ul>
  )
}

export default App
