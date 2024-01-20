import java.util.*;

public class CollectionDemo {
    public static void main(String args[]) throws Exception {
    // ArrayList <ArrayListDemo> show = new ArrayList<>();
    // ArrayListDemo ar = new ArrayListDemo();
    // show.add(ar);
    // System.out.println("SHow is: ");
    // System.out.println(show);

    System.out.println("\n\n\t1) ARRAYLIST DEMO");
     ArrayList <String> al = new ArrayList<String>();
    al.add("lencho");
    al.add("mine");
    al.add("btn");
    al.add("mootii");
    al.add("wine");
    al.add("btn");

    al.add(1,"miitii");
    al.remove(4);

    String t =al.get(3);
    System.out.println(t);
    System.out.println(al);

    System.out.println("\n Retreiving arraylist using iterator:");

    Iterator it = al.iterator();
    while ( it.hasNext()){
        System.out.println("Value: "+ it.next());
    }

    System.out.println("THE ABOVE ONE IS ABOU ArrayList CLASS!\n\n\n\n\n");
        System.out.println("\t2)LINCKED LIST DEMO");
    LinkedList <String> ll = new LinkedList<>();

    ll.add("I am here.");
    ll.add("In order to, ");
    ll.add("Help you ");
    ll.add("Yes  i am here");

    System.out.println(ll);
    System.out.println("\nRetrieving LinkedList using Iterator interface method.");
    
    Iterator llit = ll.iterator();

    while (llit.hasNext()){
        System.out.println("LL value: " + llit.next());
    }

     System.out.println("\n\n\t3)VECTOR DEMO\n\tVector is synchronized Class.");
     Vector <String> v = new Vector<>();
        v.add("SoEEC");
        v.add("SoMMCE");
        v.add("SoCEA");
        v.add("SoANC");

        //Using vector legacy methods
        v.addElement("B"); v.addElement("A"); 
        v.addElement("T"); v.addElement("M"); 
        v.addElement("A"); v.addElement("N"); 
     System.out.println(v);
     System.out.println(v.size());
     System.out.println(v.firstElement());
     v.remove(0);

     Iterator vitr = v.iterator();
     while(vitr.hasNext()){
        System.out.println("Vctr value: "+ vitr.next());
     }

     System.out.println("\n\n\t4) STACK DEMO");
     Stack <String> stack = new Stack<>();
     stack.push("Kaneh");
     stack.push("Linck");
     stack.push("Lali");

    System.out.println(stack);
    /// Retrive using iterator method

    Iterator stit = stack.iterator();
    while (stit.hasNext()){
        System.out.println("Stack value: "+stit.next());
    }
        ///SET INTERFECE DEMO

        System.out.println("\n\n\t5) HASHSET DEMO\n\n\tHash keep order of insertion if elements are string data type. But if elements are Integer all SET classes arrange the elements in their Acsending Order.");
    /////////////////////////////////////////
    Collection<String> set = new HashSet<>();
    set.add("23");
    set.add("232");
    set.add("1");
    set.add("2");

    System.out.println(set.hashCode());

    System.out.println(set);
    ///Retrieve using Iterator interface that is implemented by iterator method in the hashSet class
    Iterator hsIt = set.iterator();
    while (hsIt.hasNext()){
        System.out.println("set value: "+hsIt.next());
    }

    ////////////////////////////////////
    System.out.println("\n\n6) LINKEDHASHSET DEMO\n\n\tIt extends hashset and has additional method, and maintain insertion order ");

    LinkedHashSet<String> st=new LinkedHashSet();
        st.add("One");
        st.add("Two");
        st.add("Three");
        st.add("Four");
        st.add("Five");
        System.out.println( st.getLast());
        Iterator i=st.iterator();
        while(i.hasNext())
        {
        System.out.println(i.next());
        }

        System.out.println("\n\n 7) TREESET DEMO \n\n\t Treedet use tree to store. Treeset elements stored in #ascending Order.");
        TreeSet<String> tset=new TreeSet<>();
    tset.add("dddd");
    tset.add("bjbj");
    tset.add("eeee");
    tset.add("aaaaaaaaaaa");
    tset.add("4");

    //traversing elements
    Iterator ii =tset.iterator();
    while(ii.hasNext()){
    System.out.println("TreeSet Value: "+ ii.next());
    }

/////////////////////////////////////////////////
        System.out.println("\n\n8) TREEMAP DEMO\n\n\tIt contain key, value pair called Entry. Elements can be accesed by key.");
        TreeMap<Integer,String> map=new TreeMap<Integer,String>();
            map.put(1,"CSuuuuE");
            map.put(2,"SpooooE");
            map.put(3,"EPiiiiiCE");
            map.put(4,"ECtytytyE");


            for(Map.Entry m:map.entrySet()){
                System.out.println(m.getKey()+" "+m.getValue());
                
                }

            System.out.println(map.entrySet());
        
/////////////////////////////////////////////////////// 
                System.out.println("\nThere are HashMap,LinkedHashMap, or TreeMap. Whith almost the same emplimentation\n\n");
                

    }
}