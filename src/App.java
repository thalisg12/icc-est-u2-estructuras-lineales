import java.util.Queue;

import Controllers.QueueG;
import Controllers.Stack;
import Controllers.StackG;
import Models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Stack st = new Stack();
        st.push(10);
        st.push(-1);
        st.push(5);
        st.push(8);

        System.out.println("Tamaño:" + st.size());
        st.printStack();
        st.pop();

        System.out.println("Tamaño:" + st.size());
        st.printStack();

        StackG<Integer> sG = new StackG<Integer>();
        sG.push(10);
        sG.push(8);
        sG.push(-1);
        sG.push(5);
        System.out.println("Tamaño:" + sG.size());
        sG.printStack();
        sG.pop();
        System.out.println("Tamaño:" + sG.size());
        sG.printStack();
        System.out.println("--------------------------------------------------");

        Persona p1 = new Persona("Juan");
        Persona p2 = new Persona("Maria");
        Persona p3 = new Persona("Pedro");
        Persona p4 = new Persona("David");

        QueueG<Persona> colas = new QueueG<Persona>();
        colas.add(p1);
        colas.add(p2);
        colas.add(p3);
        colas.add(p4);

        colas.printQueue();

        Persona pB = colas.findByName("Juan");
        System.out.println("Persona encontrada -> " + (pB != null ? pB : "ninguna"));

        System.out.println("Persona Atendida ->" + colas.remove());
        colas.printQueue();

        Persona pE = colas.deleteByName("Pedro");
        System.out.println("Persona eliminada -> " + (pE != null ? pE : "ninguna"));

    }
}
