package model.�ݏo;

import model.book.Book;
import model.user.User;

public enum �ݏo�C�x���g�^�C�v {
    �I��,
    �ݏo,
    �ݏo�̎��s,
    �ԋp�������ߕt�������̒ʒm,
    �����؂�,
    ����,
    �ԋp;

    public �ݏo�C�x���g generate(Book book, User user) {
        return new �ݏo�C�x���g(book, user, this);
    }
}
