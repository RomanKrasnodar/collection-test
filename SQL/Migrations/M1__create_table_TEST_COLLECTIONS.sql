begin;


create TABLE if not exists TEST_COLLECTION
(

    TC_ID serial PRIMARY KEY ,
    TC_Collection varchar NOT NULL ,
    TC_Method varchar NOT NULL ,
    TC_Time numeric(38,0) NOT NULL ,
    TC_Iterations numeric(38,0) NOT NULL,
    TC_Start_items_quantity  numeric(38,0),
    TC_Description varchar

);

COMMENT ON TABLE TEST_COLLECTION IS 'Тест производительности коллекций в разрезе методов';

COMMENT ON COLUMN TEST_COLLECTION.TC_ID               IS 'Технический первичный ключ';
COMMENT ON COLUMN TEST_COLLECTION.TC_Collection            IS 'Название коллекции';
COMMENT ON COLUMN TEST_COLLECTION.TC_Method IS 'Название операции';
COMMENT ON COLUMN TEST_COLLECTION.TC_Time IS 'Время выполнения в наносекундах';
COMMENT ON COLUMN TEST_COLLECTION.TC_Iterations        IS 'Количество повторений';
COMMENT ON COLUMN TEST_COLLECTION.TC_Start_items_quantity             IS 'Изначальное колличество элемнентов коллекции';
COMMENT ON COLUMN TEST_COLLECTION.TC_Description           IS 'Описание';


COMMIT ;