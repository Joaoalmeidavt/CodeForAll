class MissingChar {
	public static void main(String[] args){
		String s = "CodeForAll";
		int n = 3;

		if(args.length > 1){
			s = args[0];
			n = Integer.valueOf(args[1]);
		}

		System.out.println(s.substring(0, n) + s.substring(n+1));
	}
}
