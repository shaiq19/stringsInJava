class Strings{

    int a=10;
   void stringsMethod()
   {
        StringBuffer sb=new StringBuffer("Hello ");
        sb.insert(1,"Java");//now original string is changed

       sb.append("shahaque");
        System.out.println(sb);//prints HJavaello

       StringBuffer s=new StringBuffer("Helloshahaque");
       s.delete(1,8);
       System.out.println(s);//prints Hlo
}

}