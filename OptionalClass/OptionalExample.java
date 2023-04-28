package OptionalClass;

import java.util.Optional;

public class OptionalExample {
    public static Optional<String> getName() {
        String name = "Satyam";
        return Optional.ofNullable(name);
    }

    public static void main(String[] args) {
        String str = null;
        // if (str == null)
        // System.out.println("this is null object");
        // else
        // System.out.println(str.length());

        Optional<String> optional = Optional.ofNullable(str);
        System.out.println(optional.isPresent() ? optional.get() : "no value ");
        // System.out.println(optional.get());
        System.out.println(optional.orElse("No value in this object"));
        System.out.println("-----------------");
        System.out.println(Optional.ofNullable(str).orElse("No value present"));

        Optional<String> nameOptional = getName();
        System.out.println(nameOptional.orElse("Null return"));

    }

}
