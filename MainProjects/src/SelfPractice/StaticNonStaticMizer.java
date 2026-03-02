package SelfPractice;

class StaticNonStaticMizer {
    static void modify(String s) {
    	for(int i=0;i<3;++i)
    	{
    		char c=s.charAt(i);
    		if(c=='i')
    			c='o';
    		s+=c;
    	}
    }

    public static void main(String[] args) {
        String s="tin";
        modify(s);
        System.out.println(s);
    }
}
