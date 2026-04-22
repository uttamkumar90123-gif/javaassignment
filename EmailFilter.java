import java.util.*;
import java.util.stream.*;

public class EmailFilter {
    public static void main(String[] args) {

        List<String> emails = Arrays.asList(
                "rahul.sharma@gmail.com",
                "priya.verma@yahoo.com",
                "amit.kumar@outlook.com",
                "neha123@gmail",
                "rohitsingh@company.org",
                "sneha.mehta@domain.co.in"
        );
        List<String> validEmails = emails.stream()
                .filter(email -> email.contains("@") && email.contains("."))
                .collect(Collectors.toList());

        System.out.println(validEmails);
    }
}
