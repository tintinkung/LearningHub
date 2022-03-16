public class Main {

    public static void main(String[] args) {
        /* # Generics
         *
         * What is Generics?
         * - Whenever we're working on a class
         *   usually that class has a certain datatype associate with it
         *   with generic, we can give a class parameter to write datatype (datatype parameter)
         * - basically allows you to use datatype as a template
         */

        Paper paper = new Paper();
        /* generic type can convert to anything */
        paper.setResource(315);
        paper.setResource("21 log");

        System.out.println("this paper contains resources of " + paper.getResource());

        /* we can cast a generic to specific datatype */
        Paper<Integer> organicPaper =  new Paper<Integer>();
        organicPaper.setResource(341);
        // organicPaper.setResource("21 log"); <-- no longer work
        System.out.println("this organic paper contains " + organicPaper.getResource() + " of organic wood");


        Wood wood_1 = new Wood("231 log");
        Wood wood_2 = new Wood(true);
        Wood wood_3 = new Wood(264);

        // int three = wood_3.getObject(); <-- doesn't work because java won't know how to unbox it
        int wood_3_resource = (Integer) wood_3.getObject();
        String  wood_2_resource = (String) wood_2.getObject();

        wood_2 = wood_1; // <-- this is valid java since its both object BUT not actually valid
    }
}

//a generic datatype as custom name upon creation
//           \/
class Paper<Wood> {

    // now we use a custom parameter as custom datatype
    private Wood resource;

    public void setResource(Wood resource) {
        this.resource = resource;
    }

    public Wood getResource() {
        return this.resource;
    }
}

class Wood
{   // Object is indeed a super class of etc. int, string, everything
    // - it's also a generic type
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Wood(Object object) {
        this.object = object;
    }
}