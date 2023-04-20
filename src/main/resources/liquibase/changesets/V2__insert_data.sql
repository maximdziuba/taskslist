insert into users (name, username, password)
values ('John Doe', 'johndoe@gmail.com', '$2a$10$mw/CprOIIB9qDfHG2t4V0uqoonHSIJ3mcnKu60I/TAqi8aQ26AOXe'),
       ('Mike Smith', 'mikesmith@gmail.com', '$2a$10$6mPH2LtJf1dALofrboBC4u0DbV4T6caW1CHkfeHIoyvdx29umm.zG');

insert into tasks (title, description, status, expiration_date)
values ('Buy cheese', null, 'TODO', '2023-04-17 12:00:00'),
       ('Do homework', 'Math homework', 'IN_PROGRESS', '2023-03-18 12:00:00'),
       ('Clean rooms', null, 'DONE', null),
       ('Call mama', 'Video call with Viber', 'TODO',  '2023-04-18 13:00:00');

insert into users_tasks (task_id, user_id)
values (1, 2),
       (2, 2),
       (3, 2),
       (4, 1);

insert into users_roles (user_id, role)
values (1, 'ROLE_ADMIN'),
       (1, 'ROLE_USER'),
       (2, 'ROLE_USER');