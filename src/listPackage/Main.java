package listPackage;

import java.util.*;

/**
 * @author Esmee Zhang
 * @date 6/29/20 3:13 下午
 * @projectName JAVA-master-class
 */
public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Stormbringer","deep puple");
        album.addSong("awe",4.4);
        album.addSong("qwe",6.6);
        album.addSong("fjmf",4.0);
        album.addSong("rungng ff",5.4);
        album.addSong("guagua",3.1);
        album.addSong("miamiami",4.3);
        album.addSong("aweadskh",1.4);
        album.addSong("awedaka",4.5);
        albums.add(album);

        album = new Album("this qojncq","ac/dc");
        album.addSong("gfwrn",4.4);
        album.addSong("wrnw2 62",6.6);
        album.addSong("rwth2 24",4.0);
        album.addSong("jjne ff",5.4);
        album.addSong("g24524",3.1);
        album.addSong("miamiami 552",4.3);
        album.addSong("awead4  skh",1.4);
        album.addSong("aw da 24ka",4.5);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("awedaka", playList);
        albums.get(0).addToPlayList("awe", playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(44, playList);

        play(playList);


    }

    private static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forword = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("no song to paly");
            return;
        }else{
            System.out.println("now playing" + listIterator.next().toString());
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0
                    :
                    System.out.println("bye");
                quit = true;
                case 1:
                    if(!forword){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forword = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("now playing" + listIterator.next().toString());
                    }else{
                        System.out.println("end");
                        forword = false;
                    }
                    break;
                case 2:
                    if(forword){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forword = true;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("now palying" + listIterator.previous().toString());
                        forword = false;
                    }
                    break;
                case 3:
                    if(forword){
                        if(listIterator.hasPrevious()){
                            System.out.println("repaly");
                            forword = false;
                        }else{
                            if(listIterator.hasNext()){
                                System.out.println("repaly");
                                forword = true;
                            }
                        }

                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMemu();
                    break;
            }
        }
    }

    private static void printMemu(){
        System.out.println("Available action");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("========");
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }


}
