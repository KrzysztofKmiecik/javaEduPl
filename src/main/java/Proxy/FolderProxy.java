package Proxy;

public class FolderProxy implements IFolder{

    private Folder folder;
    private User    user;

    public FolderProxy(User user) {
        this.user = user;
    }

    @Override
    public void performOperations() {
        if(user.getUserName().equalsIgnoreCase("kmk")&&user.getPassword().equalsIgnoreCase("mp3")){
            folder=new Folder();
            folder.performOperations();
        }else{
            System.out.println( "nie masz dostepu do folderu");
        }
    }
}
