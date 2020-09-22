
public class studentclass {
    int id;

    studentclass(String name) {
        System.out.println("NAME:" +name);
    }
    studentclass(int id){
        System.out.println("ID:" +id);
    }
    studentclass(){
        System.out.println("unknown");
    }

    public static void main(String[] args) {

        studentclass s = new studentclass("prathyusha");
        studentclass s1 = new studentclass(20);

    }
}

