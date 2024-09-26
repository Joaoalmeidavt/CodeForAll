class StringManipulations {
    public static void main(String[] args){
        String str = "https://www.academiadecodigo.org";
        String domain = "";
        String name = "";

        domain = str.replace("https://", "");
        name = "< " + str.replace("https://www.", "").replace(".org", "").replaceFirst("a", "A").replaceFirst("iad", "ia D").replaceFirst("co", " Co") + "_ >";

        System.out.println("I am a Code Cadet at " + name + ", " + domain);
    }
}
