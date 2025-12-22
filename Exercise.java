public class Exercise {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hey");
        System.out.println(sb.capacity());

        sb.append(" hi");
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);

        sb.deleteCharAt(0);
        System.out.println(sb);

        sb.insert(0, "H");
        System.out.println(sb);
    }
}
