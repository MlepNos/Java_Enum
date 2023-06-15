public enum Topping {

    MUSTARD,
    PICKLES,
    BACON,
    CHEDDAR,
    TOMATO;

    public double getPrice(){
        return switch (this){
            case MUSTARD -> 2.5;
            case PICKLES -> 0.5;
            case BACON -> 1.5;
            case CHEDDAR -> 4.5;
            default -> 0.0;
        };
    }
}
