package ru.netology.domain;

public class PostInfo {
    private int id; //id записи
    private int idOwner; //идентификатор владельца стены
    private int idFrom; //идентификатор автора записи (от чьего имени опубликована запись)
    private int byCreate; //идентификатор администратора, который опубликовал запись
    private int date; //дата размещения поста
    private String text; //текст записи
    private int idReplyOwner; //идентификатор владельца записи
    private int idReplyPost; //идентификатор записи, в ответ на которую была оставлена текущая
    private int onlyFriends; //1, если запись была создана с опцией "Только для друзей
    private String copyright; //источник материала
    private LikesInfo likesInfo; //информация о лайках
    private ReportsInfo reportsInfo; //информация о репостах
    private ViewsInfo viewsInfo; //информация о просмотрах поста
    private String typePost; //тип записи:пост, копия, ответ
    private PostSource postSource; //инфорация о способе размещения записи
    private Geo geo; //информация о местоположении
    private int idSigner; //идентификатор автора
    private int copyHistory; //массив, содержащий историю репостов для записи
    private boolean canFix; //можно закрепить запись
    private boolean canDelete; //можно удалить запись
    private boolean canEdit; //можно редактировать запись
    private boolean canCopy; //можно скопировать запись
    private int isPinned; //запись закреплена или нет
    private int idOwnerGive; //id пользователей, которые поделились постом
    private int idOwnerLike; //id пользователей, которым понравился пост
    private int markedAsAds; //содержит ли запись отметку реклама
    private boolean isFavorite; //пост добавлен в закладки у пользователя
    private int idPostponed; //идентификатор отложенной записи


}