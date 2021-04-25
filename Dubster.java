/*

Polycarpus works as a DJ in the best Berland nightclub, and he often uses dubstep music in his performance.
Recently, he has decided to take a couple of old songs and make dubstep remixes from them.

Let's assume that a song consists of some number of words. To make the dubstep remix of this song,
Polycarpus inserts a certain number of words "WUB" before the first word of the song (the number may be zero),
after the last word (the number may be zero), and between words (at least one between any pair of neighbouring words),
and then the boy glues together all the words, including "WUB", in one string and plays the song at the club.

For example, a song with words "I AM X" can transform into a dubstep remix as "WUBIWUBAMWUBWUBX"
and cannot transform into "WUBWUBIAMWUBX".

Recently, Jonny has heard Polycarpus's new dubstep track, but since he isn't into modern music,
he decided to find out what was the initial song that Polycarpus remixed. Help Jonny restore the original song.

Input
The input consists of a single non-empty string, consisting only of uppercase English letters, the string's length
doesn't exceed 200 characters

Output
Return the words of the initial song that Polycarpus used to make a dubsteb remix. Separate the words with a space.


*/

public class Dubster {
    public static String songDecoder(String song) {

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
}
