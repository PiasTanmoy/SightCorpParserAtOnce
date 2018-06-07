package Others;

/**
 * Created by asd on 5/25/2018.
 */
public class makeData {
    /*
    INSERT INTO `user` (`id`, `image`, `firstname`, `lastname`, `username`, `email`, `password`, `phone`, `NID`, `bkash`, `rocket`, `bank`, `educational_status`, `user_skill`, `user_info`, `user_place`, `profession`) VALUES
    (NULL, 'Koala.jpg', 'joy', 'hossain', 'zabbir222', 'zabbirhossain222@gmail.com', '1234', '01933722564', '', '', '', '', 'ssc,hsc,higher', 'wow bdhhhh', 'wow bd.', 'pabna', 'Doctor')
     */
    public static void main(String[] args) {
        int counter = 1;
        String username = "dummy";
        String email = "dummy@gmail.com";

        //INSERT INTO `user` (`id`, `image`, `firstname`, `lastname`, `username`, `email`, `password`, `phone`, `NID`, `bkash`, `rocket`, `bank`, `educational_status`, `user_skill`, `user_info`, `user_place`, `profession`) VALUES
        String model = "(NULL , 'Koala.jpg', 'joy', 'hossain', 'zabbir', 'zabbirhossain729@gmail.com', '1234', '01933722564', '', '', '', '', 'ssc,hsc,higher', 'wow bdhhhh', 'wow bd.', 'rajshahi', 'Doctor'), ";




        for(int i=0; i<100; i++) {
            System.out.println("(NULL , 'Koala.jpg', 'dumm', 'dumm', 'dummy" +i +"', " +
                    "'dummy" + i +"@gmail.com', " +
                    "'1234', '01933722564', '', '', '', '', 'ssc,hsc,MBBS', '', '', ' ,dhaka', 'Doctor'), ");
        }
    }
}
