package es.upm.miw.iwvg_devops.code;

import java.util.stream.Stream;

public class Searches {

    public Stream<String> findUserFamilyNameByAllNegativeSignFractionDistinct() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream()
                        .anyMatch(fraction -> fraction.getNumerator() < 0 || fraction.getDenominator() < 0))
                .map(User::getFamilyName)
                .distinct();
    }

    public Stream<String> findUserFamilyNameBySomeImproperFraction() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream()
                        .anyMatch(fraction -> fraction.isImproper()))
                .map(User::getFamilyName);
    }
}