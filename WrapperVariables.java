public class WrapperVariables {

    public static void main(String ... args){
        
        System.out.println("Wrapper variables program has started!");

        Character characterValue = 'A';
        System.out.println("Wrapper character: "+characterValue);
        System.out.println("Wrapper character: "+characterValue.toString());
        System.out.println("Wrapper character equals: "+characterValue.equals('B'));

        Integer intValue = 234;
        System.out.println("Wrapper integer: "+intValue);
        System.out.println("Wrapper integer: "+intValue.toString());
        System.out.println("Wrapper integer equals: "+intValue.equals(234));

        Long longValue = 2355L;
        System.out.println("Wrapper long: "+longValue);
        System.out.println("Wrapper long: "+longValue.toString());
        System.out.println("Wrapper long equals: "+longValue.equals(2355L));

        Float floatValue = 123.11f;
        System.out.println("Wrapper float: "+floatValue);
        System.out.println("Wrapper float: "+floatValue.toString());
        System.out.println("Wrapper float equals: "+floatValue.equals(123f));

        Double doubleValue = 1234.555;
        System.out.println("Wrapper double: "+doubleValue);
        System.out.println("Wrapper double: "+doubleValue.toString());
        System.out.println("Wrapper double equals: "+doubleValue.equals(1234));

        Boolean booleanVariable = doubleValue.equals(1234.555);
        System.out.println("Wrapper boolean: "+booleanVariable);

        int primitiveIntVal = intValue.intValue();
        System.out.println("Wrapper to primitive: "+primitiveIntVal);

    }

}