CREATE SCHEMA otus_test
    AUTHORIZATION pg_database_owner;

CREATE TABLE otus_test.test
(
    id serial NOT NULL,
    name text NOT NULL,
    PRIMARY KEY (id),
    UNIQUE (name)
);

CREATE TABLE otus_test.question
(
    id serial NOT NULL,
    test_id integer NOT NULL,
    question_text text NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (test_id)
        REFERENCES otus_test.test (id) MATCH SIMPLE
        ON UPDATE RESTRICT
        ON DELETE RESTRICT
);

CREATE TABLE otus_test.answer
(
    id serial NOT NULL,
    question_id integer NOT NULL,
    answer_text text NOT NULL,
    is_correct boolean NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (question_id)
        REFERENCES otus_test.question (id) MATCH SIMPLE
        ON UPDATE RESTRICT
        ON DELETE RESTRICT
);

INSERT INTO otus_test.test(id, name) VALUES (1, 'Тесты по географии (5 класс)');

INSERT INTO otus_test.question(id, test_id, question_text)
    VALUES (1, 1, 'Какое из перечисленных явлений относится к физическим?');

INSERT INTO otus_test.answer(id, question_id, answer_text, is_correct)
    VALUES (1, 1, 'восход солнца', true);
INSERT INTO otus_test.answer(id, question_id, answer_text, is_correct)
    VALUES (2, 1, 'листопад', false);
INSERT INTO otus_test.answer(id, question_id, answer_text, is_correct)
    VALUES (3, 1, 'смена окраски меха животных зимой', false);
INSERT INTO otus_test.answer(id, question_id, answer_text, is_correct)
    VALUES (4, 1, 'цветение деревьев', false);
 
INSERT INTO otus_test.question(id, test_id, question_text)
    VALUES (2, 1, 'Какая наука изучает разнообразные явления природы?');

INSERT INTO otus_test.answer(id, question_id, answer_text, is_correct)
    VALUES (5, 2, 'астрономия', false);
INSERT INTO otus_test.answer(id, question_id, answer_text, is_correct)
    VALUES (6, 2, 'география', false);
INSERT INTO otus_test.answer(id, question_id, answer_text, is_correct)
    VALUES (7, 2, 'физика', true);
INSERT INTO otus_test.answer(id, question_id, answer_text, is_correct)
    VALUES (8, 2, 'химия', false);
--
INSERT INTO otus_test.test(id, name) 
    VALUES (2, 'Тесты по истории (5 класс)');

INSERT INTO otus_test.question(id, test_id, question_text)
    VALUES (3, 2, 'Орудие труда, при помощи которого первобытные люди ловили рыбу?');

INSERT INTO otus_test.answer(id, question_id, answer_text, is_correct)
    VALUES (9, 3, 'рубило', false);
INSERT INTO otus_test.answer(id, question_id, answer_text, is_correct)
    VALUES (10, 3, 'гарпун', true);
INSERT INTO otus_test.answer(id, question_id, answer_text, is_correct)
    VALUES (11, 3, 'лук', false);

INSERT INTO otus_test.question(id, test_id, question_text)
    VALUES (4, 2, 'Какое занятие первобытных людей привело к возникновению земледелия?');

INSERT INTO otus_test.answer(id, question_id, answer_text, is_correct)
    VALUES (12, 4, 'охота', false);
INSERT INTO otus_test.answer(id, question_id, answer_text, is_correct)
    VALUES (13, 4, 'скотоводство', false);
INSERT INTO otus_test.answer(id, question_id, answer_text, is_correct)
    VALUES (14, 4, 'собирательство', true);

-- 

select * 
from otus_test.test t,
     otus_test.question q,
     otus_test.answer a
where q.test_id = t.id
and a.question_id = q.id
and is_correct = true
order by t.id, q.id, a.id;