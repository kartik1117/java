
class shoes {

    public static void main(String[] args) {

        shoes x = new jordan();
        x.laces();
        x.colour();

    }

    void laces() {

    }

    void colour() {

    }

    void type() {

    }

}

class jordan extends shoes {

    @Override
    void laces() {

        super.laces();

        int size = 20;
        String colour = "red";

        System.out.println("the size is " + size + "  the colour is" + colour);
    }

    void colour() {
        String PrimaryColour = "  red";
        String SecondryColour = "  white";

        System.out.println(PrimaryColour + SecondryColour);
    }

    void type()     {
        
    }
           }

