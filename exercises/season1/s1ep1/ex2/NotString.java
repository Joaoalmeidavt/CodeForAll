class NotString {
        public static void main(String[] args){
                String s = "semicolon";
		if(args.length > 0){
			s = args[0];
		}
                System.out.println((s.contains("not")) ? s : "not " + s);
        }
}
