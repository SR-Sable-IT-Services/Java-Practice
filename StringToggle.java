public class StringToggle {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String toggledString = toggleString(str);
        System.out.println("Toggled string: " + toggledString);
    }
    
    public static String toggleString(String str) {
        StringBuilder toggled = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            }
            
            toggled.append(c);
        }
        
        return toggled.toString();
    }
}
