class TestPostApp {
    public static void main(String[] args) {
        if (args.length == 3) {
            Post newPost = new Post(args[0], args[1], args[2]);
            System.out.println(newPost.toString());
        }
        //else if (length(args) == 4) {
          //  Post newPost = new Post(args[0], args[1], args[2], args[3]);
            //newPost.toString();
        //}
        else {
            System.out.println("Invalid number of arguments.");
        }
    }
}