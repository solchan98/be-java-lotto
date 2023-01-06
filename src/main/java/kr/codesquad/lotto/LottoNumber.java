package kr.codesquad.lotto;

import java.util.Objects;

public class LottoNumber {

    private final int number;

    public LottoNumber(int number) {
        boolean invalidNumber = number < 1 || number > 45;
        if (invalidNumber) {
            throw new IllegalArgumentException("로또 번호는 1 ~ 45 사이의 숫자만 입력 가능합니다.");
        }
        this.number = number;
    }

    public int number() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LottoNumber that = (LottoNumber) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
