package Proxy;

public class Main {
    public static void main(String[] args) {
        User user=new User("kmk","mp3");
        FolderProxy folderProxy=new FolderProxy(user);
        folderProxy.performOperations();


        User userNOK=new User("kmkk","mp33");
        FolderProxy folderProxyNOK=new FolderProxy(userNOK);
        folderProxyNOK.performOperations();


    }
}
