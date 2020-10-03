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
                        .anyMatch(Fraction::isImproper))
                .map(User::getFamilyName);
    }

    public Fraction findFractionDivisionByUserId(String id) {
        return new UsersDatabase().findAll()
                .filter(user -> id.equals(user.getId()))
                .flatMap(user -> user.getFractions().stream())
                .reduce(Fraction::divide).orElse(new Fraction());
    }

    public Fraction findFirstProperFractionByUserId(String id) {
        return new UsersDatabase().findAll()
                .filter(user -> id.equals(user.getId()))
                .flatMap(user -> user.getFractions().stream())
                .filter(Fraction::isProper)
                .findFirst().orElse(null);
    }
}