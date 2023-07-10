package chap_11;

public class _Quiz_11 {
    public static void main(String[] args) {
        int error = 2;

        try {
            switch (error) {
                case 0:
                    System.out.println("(상품 구매를 완료하였습니다.)");
                    break;
                case 1:
                    throw new NotOnSaleException("상품 구매 가능 시간이 아닙니다.");
                case 2:
                    throw new SoldOutException("해당 상품은 매진되었습니다.");
            }
        } catch (NotOnSaleException e) {
            System.out.println(e.getMessage() + "\n상품 구매는 20시부터 가능합니다.");
        } catch (SoldOutException e) {
            System.out.println(e.getMessage());
            System.out.println("다음 기회에 이용해주세요.");
        }
    }
}

class NotOnSaleException extends Exception {
    public NotOnSaleException(String message) {
        super(message);
    }
}

class SoldOutException extends Exception {
    public SoldOutException(String message) {
        super(message);
    }
}
