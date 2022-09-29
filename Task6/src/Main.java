public class Main {
    public static void main(String[] args) {

    Cafe Hyggekaffe = new Cafe();

    Hyggekaffe.loadMenuData();

    for(String s:Hyggekaffe.coffeeMenu){
        System.out.println(s);
    }
    }
}
