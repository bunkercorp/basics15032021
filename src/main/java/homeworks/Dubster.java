package homeworks;

public class Dubster {
    public static String SongDecoder (String song){
        StringBuilder sb = new StringBuilder();
        int i, j;
        for(i = 0; i<song.length()-2; i++){
            if(song.substring(i, i+3).equals("WUB")){
                sb.append(" ");
                i += 2;
            }else{
                sb.append(song.substring(i, i+1));
            }
        }
        if(i < song.length()) {
            sb.append(song.substring(i, song.length()));
        }

        while(sb.substring(0, 1).equals(" ")){
            sb.delete(0, 1);
        }

        while(sb.substring(sb.length()-1, sb.length()).equals(" ")){
            sb.delete(sb.length()-1, sb.length());
        }

        i = 0; j = 0;
        while(i < sb.length()){
            if(sb.charAt(i) != ' '){
                i++;
            }else{
                j = i + 1;
                while(j < sb.length()){
                    if(sb.charAt(j) == ' '){
                        j++;
                    }else{
                        sb.replace(i, j, " ");
                        i++;
                        break;
                    }
                }
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(SongDecoder("WUBIWUBAMWUBWUBX"));
    }
}