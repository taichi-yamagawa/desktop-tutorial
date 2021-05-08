/**
 * バブルソート
 * チェックテスト-Java1章
 *
 */
public class Check{
    public static void main(String[] args){
        /*
        * 問1
        * int型の配列dataを作成し、値を3,1,2,7,5で初期化しなさい
        */
        int[] data = {3,1,2,7,5};

        /*
        * 問2
        * 以下のfor文を完成させなさい
        */
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < data.length-1; i++) {
            for (int j = data.length-1; j > i; j--) {
                /*
                * 問3
                * 以下、配列の添字を入れてソートを完成させなさい
                */

                /*要素の後ろ２つから比較していき、昇順になるように数値を入れ替える
                * 昇順になっていない場合は入れ替える
                */
                if(data[j-1] > data[j]){

                  //data[j](小さい方の数値)の要素をint型の box に代入
                  int box = data[j];

                  //data[j-1](大きい方の数値)の要素をdata[j](小さい方の数値)の要素に代入
                  data[j] = data[j-1];

                  //box(小さい方の数値)の要素をdata[j-1](大きい方の数値)の要素に代入
                  data[j-1] = box;
                }
            }
        }

        //dataの要素の数だけループ
        for(int i = 0; i < data.length; i++){

            //dataの要素の表示(昇順ソート)
            System.out.print(data[i] + " ");
        }
    }
}
