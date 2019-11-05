package by.courses.java.streamapi.operation;


public class DefaultStream implements by.courses.java.streamapi.operation.Operation<by.courses.java.streamapi.entity.UserBase> {
    public java.util.Collection<by.courses.java.streamapi.entity.UserBase> removeWithMaxAge(java.util.Collection<by.courses.java.streamapi.entity.UserBase> entities) {
        by.courses.java.streamapi.entity.UserBase oneOfOldest = entities.stream().max(java.util.Comparator.comparing(by.courses.java.streamapi.entity.UserBase::getAge)).get();
        return entities.stream().filter(( temp) -> (temp.getAge()) < (oneOfOldest.getAge())).collect(java.util.stream.Collectors.toList());
    }

    @java.lang.Override
    public java.util.Collection<by.courses.java.streamapi.entity.UserBase> removeAllOlder(java.util.Collection<by.courses.java.streamapi.entity.UserBase> entities, int age) {
        return entities.stream().filter(( x) -> (x.getAge()) <= age).collect(java.util.stream.Collectors.toList());
    }

    @java.lang.Override
    public double getAverageAge(java.util.Collection<by.courses.java.streamapi.entity.UserBase> entities) {
        return entities.stream().mapToInt(( temp) -> temp.getAge()).average().getAsDouble();
    }

    @java.lang.Override
    public by.courses.java.streamapi.entity.UserBase getThirdInCollection(java.util.Collection<by.courses.java.streamapi.entity.UserBase> entities) {
        return entities.stream().skip(2).findFirst().get();
    }

    @java.lang.Override
    public java.util.Collection<by.courses.java.streamapi.entity.UserBase> getTwoUsersStartingFromSecond(java.util.Collection<by.courses.java.streamapi.entity.UserBase> entities) {
        return entities.stream().skip(1).limit(2).collect(java.util.stream.Collectors.toList());
    }

    public java.util.Collection<by.courses.java.streamapi.entity.UserBase> getAllElementsByTemplate(java.util.Collection<by.courses.java.streamapi.entity.UserBase> entities, by.courses.java.streamapi.entity.UserBase userBase) {
        return entities.stream().filter(( temp) -> temp.equals(userBase)).collect(java.util.stream.Collectors.toList());
    }

    @java.lang.Override
    public boolean isCharacterPresentInAllNames(java.util.Collection<by.courses.java.streamapi.entity.UserBase> entities, java.lang.String character) {
        return entities.stream().allMatch(( s) -> s.getName().toLowerCase().contains(character.toLowerCase()));
    }

    @java.lang.Override
    public java.util.Collection<by.courses.java.streamapi.entity.UserBase> addValueToAllNames(java.util.Collection<by.courses.java.streamapi.entity.UserBase> entities, java.lang.String value) {
        return entities.stream().map(( s) -> by.courses.java.streamapi.entity.UserBase.of(((s.getName()) + value), s.getAge())).collect(java.util.stream.Collectors.toList());
    }

    @java.lang.Override
    public java.util.Collection<by.courses.java.streamapi.entity.UserBase> sortByNameThanByAge(java.util.Collection<by.courses.java.streamapi.entity.UserBase> entities) {
        return entities.stream().sorted(java.util.Comparator.comparing(by.courses.java.streamapi.entity.UserBase::getName).thenComparing(by.courses.java.streamapi.entity.UserBase::getAge)).collect(java.util.stream.Collectors.toList());
    }
}

