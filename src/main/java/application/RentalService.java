package application;

import model.book.Book;
import model.user.User;
import model.�ݏo.�ݏo�C�x���g;
import model.�ݏo.�ݏo�C�x���g�^�C�v;
import model.�ݏo.�ݏo�C�x���g���|�W�g��;
import org.springframework.beans.factory.annotation.Autowired;

public class RentalService {

    @Autowired
    �ݏo�C�x���g���|�W�g�� ���|�W�g��;

    void �ݏo(Book book,User user) {
        record(�ݏo�C�x���g�^�C�v.�ݏo, book, user);
    }

    void �ԋp(Book book, User user) {
        record(�ݏo�C�x���g�^�C�v.�ԋp, book, user);
    }

    private void record(�ݏo�C�x���g�^�C�v �ݏo�C�x���g�^�C�v, Book book, User user) {
        �ݏo�C�x���g �ݏo�C�x���g = �ݏo�C�x���g�^�C�v.generate(book, user);
        ���|�W�g��.record(�ݏo�C�x���g);
    }
}
