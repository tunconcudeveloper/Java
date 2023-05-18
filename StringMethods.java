class StringMethods{
    public static void main(String[] args) {
        
        String name = "   TUTTuu,   ttUUtt,   TUTTuu,   ";

        System.out.println(name.format("String's name is : %s", name));

        System.out.println(name.toLowerCase());

        System.out.println(name.replaceAll("t", "T"));

        System.out.println(name.repeat(3));

        System.out.println(name.charAt(5));

        System.out.println(name.codePointAt(5));

        System.out.println(name.compareTo(name.toUpperCase()));

        System.out.println(name.concat("Hello"));

        System.out.println(name.contains("TUT"));

        System.out.println(name.endsWith("   "));

        System.out.println(name.substring(3, 9));

        System.out.println(name.length());

        String[] array = name.split("u");
        for (String string : array) {
            System.out.print(string);
        }

        System.out.println(name.trim());

        System.out.println(name.substring(3, 6));

        System.out.println(name.equals(array));

        System.out.println(name.indent(10));

        System.out.println(name.isBlank());

        System.out.println(name.isEmpty());

        System.out.println(name.stripLeading());

        System.out.println(name.stripTrailing());

        System.out.println(name.getClass());

        


    }
}