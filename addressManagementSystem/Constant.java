package addressManagementSystem;

public class Constant {

    public static final String CHOOSE_MENU_MESSAGE = "메뉴를 선택해주세요 : ";
    public static final String SEARCH_NAME_MESSAGE = "검색할 이름을 입력하세요 : ";
    public static final String EMPTY_ADDRESS_BOOK_MESSAGE = "연락처가 비어있습니다.";
    public static final String NOT_FOUND_MESSAGE = "연락처를 찾을 수 없습니다.";

    public static final String INPUT_COMPANY_MESSAGE = "회사명을 입력하세요 : ";
    public static final String INPUT_RELATIONSHIP_MESSAGE = "관계를 입력하세요 : ";
    public static final String PRINT_NAME = "이름 : ";
    public static final String PRINT_PHONE_NUMBER = "전화번호 : ";
    public static final String PRINT_COMPANY = "회사명 : ";
    public static final String PRINT_RELATIONSHIP = "관계 : ";
    public static final String SEPARATOR = ", ";

    public enum InitMessages {
        ADD_BUSINESS_CONTACT_MESSAGE("비즈니스 연락처 추가", 1),
        ADD_PERSONAL_CONTACT_MESSAGE("개인 연락처 추가", 2),
        PRINT_CONTACT_MESSAGE("연락처 출력", 3),
        SEARCH_CONTACT_MESSAGE("연락처 검색", 4),
        EXIT_MESSAGE("종료", 5);

        private final String message;
        private final int order;

        InitMessages(String message, int order) {
            this.message = message;
            this.order = order;
        }

        public String getMessage() {
            return this.message;
        }

        public int getOrder() {
            return this.order;
        }

    }

    public enum AddContactMessage {
        INPUT_NAME_MESSAGE("이름을 입력하세요 : "),
        INPUT_PHONE_NUMBER_MESSAGE("전화번호를 입력하세요 : ");

        private final String message;

        AddContactMessage(String message) {
            this.message = message;
        }

        public String getMessage() {
            return this.message;
        }
    }


}
