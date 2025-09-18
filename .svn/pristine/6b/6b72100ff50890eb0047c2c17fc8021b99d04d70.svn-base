/*==============================================================*/
/* DBMS name:      Microsoft SQL Server 2008                    */
/* Created on:     6/4/2025 7:07:24 PM                          */
/*==============================================================*/


if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Adresni podaci"') and o.name = 'FK_ADRESNI _KOD DRUGO_POSLOVNI')
alter table "Adresni podaci"
   drop constraint "FK_ADRESNI _KOD DRUGO_POSLOVNI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Adresni podaci"') and o.name = 'FK_ADRESNI _KONTAKT P_REGISTAR')
alter table "Adresni podaci"
   drop constraint "FK_ADRESNI _KONTAKT P_REGISTAR"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Adresni podaci"') and o.name = 'FK_ADRESNI _MJESTO AD_NASELJEN')
alter table "Adresni podaci"
   drop constraint "FK_ADRESNI _MJESTO AD_NASELJEN"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Adresnica') and o.name = 'FK_ADRESNIC_NACIN PLA_NACIN PL')
alter table Adresnica
   drop constraint "FK_ADRESNIC_NACIN PLA_NACIN PL"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Adresnica') and o.name = 'FK_ADRESNIC_NACIN PRE_NACIN PR')
alter table Adresnica
   drop constraint "FK_ADRESNIC_NACIN PRE_NACIN PR"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Adresnica') and o.name = 'FK_ADRESNIC_OBRAZAC A_POSILJKA')
alter table Adresnica
   drop constraint "FK_ADRESNIC_OBRAZAC A_POSILJKA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Adresnica') and o.name = 'FK_ADRESNIC_POSILJALA_KLIJENT')
alter table Adresnica
   drop constraint FK_ADRESNIC_POSILJALA_KLIJENT
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Adresnica') and o.name = 'FK_ADRESNIC_PRIMALAC_KLIJENT')
alter table Adresnica
   drop constraint FK_ADRESNIC_PRIMALAC_KLIJENT
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Aktivne posiljke"') and o.name = 'FK_AKTIVNE _JEDINICA _ORGANIZA')
alter table "Aktivne posiljke"
   drop constraint "FK_AKTIVNE _JEDINICA _ORGANIZA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Aktivne posiljke"') and o.name = 'FK_AKTIVNE _POSILJKA _POSILJKA')
alter table "Aktivne posiljke"
   drop constraint "FK_AKTIVNE _POSILJKA _POSILJKA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Atribut') and o.name = 'FK_ATRIBUT_RESURSI P_POSLOVNI')
alter table Atribut
   drop constraint "FK_ATRIBUT_RESURSI P_POSLOVNI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Carinska deklaracija"') and o.name = 'FK_CARINSKA_DEKLARACI_CARINSKA')
alter table "Carinska deklaracija"
   drop constraint FK_CARINSKA_DEKLARACI_CARINSKA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Carinska deklaracija"') and o.name = 'FK_CARINSKA_NALOGODAV_ORGANIZA')
alter table "Carinska deklaracija"
   drop constraint FK_CARINSKA_NALOGODAV_ORGANIZA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Carinska deklaracija"') and o.name = 'FK_CARINSKA_PREDMET D_POSILJKA')
alter table "Carinska deklaracija"
   drop constraint "FK_CARINSKA_PREDMET D_POSILJKA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Carinska deklaracija"') and o.name = 'FK_CARINSKA_STATUS DE_STATUS D')
alter table "Carinska deklaracija"
   drop constraint "FK_CARINSKA_STATUS DE_STATUS D"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Carinska deklaracija"') and o.name = 'FK_CARINSKA_TIP DEKLA_TIP DEKL')
alter table "Carinska deklaracija"
   drop constraint "FK_CARINSKA_TIP DEKLA_TIP DEKL"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Carinska dokumentacija"') and o.name = 'FK_CARINSKA_MJESTO DO_NASELJEN')
alter table "Carinska dokumentacija"
   drop constraint "FK_CARINSKA_MJESTO DO_NASELJEN"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Carinska dokumentacija"') and o.name = 'FK_CARINSKA_VOZAC_REGISTAR')
alter table "Carinska dokumentacija"
   drop constraint FK_CARINSKA_VOZAC_REGISTAR
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Carinska dokumentacija"') and o.name = 'FK_CARINSKA_VOZILO_VOZILO')
alter table "Carinska dokumentacija"
   drop constraint FK_CARINSKA_VOZILO_VOZILO
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Drzava') and o.name = 'FK_DRZAVA_AKTUELNI _NASELJEN')
alter table Drzava
   drop constraint "FK_DRZAVA_AKTUELNI _NASELJEN"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Drzava') and o.name = 'FK_DRZAVA_TEKUCE UR_DRAVNO')
alter table Drzava
   drop constraint "FK_DRZAVA_TEKUCE UR_DRAVNO"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Dravljanstvo') and o.name = 'FK_DRAVLJA_DRAVLJAN_REGISTAR')
alter table Dravljanstvo
   drop constraint FK_DRAVLJA_DRAVLJAN_REGISTAR
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Dravljanstvo') and o.name = 'FK_DRAVLJA_DRAVLJAN_DRZAVA')
alter table Dravljanstvo
   drop constraint FK_DRAVLJA_DRAVLJAN_DRZAVA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Evidencija posiljki"') and o.name = 'FK_EVIDENCI_EVIDENCIJ_POSILJKA')
alter table "Evidencija posiljki"
   drop constraint FK_EVIDENCI_EVIDENCIJ_POSILJKA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Evidencija posiljki"') and o.name = 'FK_EVIDENCI_SADRZI PO_ORGANIZA')
alter table "Evidencija posiljki"
   drop constraint "FK_EVIDENCI_SADRZI PO_ORGANIZA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Evidencija reklamacija"') and o.name = 'FK_EVIDENCI_ISTORIJA _STATUS R')
alter table "Evidencija reklamacija"
   drop constraint "FK_EVIDENCI_ISTORIJA _STATUS R"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Evidencija reklamacija"') and o.name = 'FK_EVIDENCI_PREDMET R_POSILJKA')
alter table "Evidencija reklamacija"
   drop constraint "FK_EVIDENCI_PREDMET R_POSILJKA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Evidencija reklamacija"') and o.name = 'FK_EVIDENCI_REKLAMACI_ORGANIZA')
alter table "Evidencija reklamacija"
   drop constraint FK_EVIDENCI_REKLAMACI_ORGANIZA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Evidencija reklamacija"') and o.name = 'FK_EVIDENCI_SVRHA REK_TIP REKL')
alter table "Evidencija reklamacija"
   drop constraint "FK_EVIDENCI_SVRHA REK_TIP REKL"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Flota vozila"') and o.name = 'FK_FLOTA VO_FLOTA VOZ_ORGANIZA')
alter table "Flota vozila"
   drop constraint "FK_FLOTA VO_FLOTA VOZ_ORGANIZA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Flota vozila"') and o.name = 'FK_FLOTA VO_VOZILO U _VOZILO')
alter table "Flota vozila"
   drop constraint "FK_FLOTA VO_VOZILO U _VOZILO"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Glavni grad"') and o.name = 'FK_GLAVNI G_GLAVNI GR_DRZAVA')
alter table "Glavni grad"
   drop constraint "FK_GLAVNI G_GLAVNI GR_DRZAVA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Glavni grad"') and o.name = 'FK_GLAVNI G_GLAVNI GR_NASELJEN')
alter table "Glavni grad"
   drop constraint "FK_GLAVNI G_GLAVNI GR_NASELJEN"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Istorija adresnice"') and o.name = 'FK_ISTORIJA_OBRAZAC A_ADRESNIC')
alter table "Istorija adresnice"
   drop constraint "FK_ISTORIJA_OBRAZAC A_ADRESNIC"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Istorija adresnice"') and o.name = 'FK_ISTORIJA_POSILJKA_POSILJKA')
alter table "Istorija adresnice"
   drop constraint FK_ISTORIJA_POSILJKA_POSILJKA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Istorija adresnice"') and o.name = 'FK_ISTORIJA_ADRESNICE _ZAPOSLENI')
alter table "Istorija adresnice"
   drop constraint "FK_ISTORIJA_ADRESNICE _ZAPOSLENI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Istorija akcija"') and o.name = 'FK_ISTORIJA_AKCIJA NA_TABELA')
alter table "Istorija akcija"
   drop constraint "FK_ISTORIJA_AKCIJA NA_TABELA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Istorija akcija"') and o.name = 'FK_ISTORIJA_AKCIJA _KORISNIK')
alter table "Istorija akcija"
   drop constraint "FK_ISTORIJA_AKCIJA _KORISNIK"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Istorija akcija"') and o.name = 'FK_ISTORIJA_ISTORIJA _ORGANIZA')
alter table "Istorija akcija"
   drop constraint "FK_ISTORIJA_ISTORIJA _ORGANIZA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Istorija deklaracije"') and o.name = 'FK_ISTORIJA_CARINSKA _CARINSKA')
alter table "Istorija deklaracije"
   drop constraint "FK_ISTORIJA_CARINSKA _CARINSKA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Istorija deklaracije"') and o.name = 'FK_ISTORIJA_ISTORIJA _STATUS D')
alter table "Istorija deklaracije"
   drop constraint "FK_ISTORIJA_ISTORIJA _STATUS D"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Istorija deklaracije"') and o.name = 'FK_ISTORIJA_DEKLARACIJE_ZAPOSLENI')
alter table "Istorija deklaracije"
   drop constraint FK_ISTORIJA_DEKLARACIJE_ZAPOSLENI
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Istorija izmjena"') and o.name = 'FK_ISTORIJA_IZMJENA _KORISNIK')
alter table "Istorija izmjena"
   drop constraint "FK_ISTORIJA_IZMJENA _KORISNIK"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Istorija izmjena"') and o.name = 'FK_ISTORIJA_IZMJENA U_ORGANIZA')
alter table "Istorija izmjena"
   drop constraint "FK_ISTORIJA_IZMJENA U_ORGANIZA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Istorija izmjena"') and o.name = 'FK_ISTORIJA_IZMJENE N_TABELA')
alter table "Istorija izmjena"
   drop constraint "FK_ISTORIJA_IZMJENE N_TABELA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Istorija logova pristupa"') and o.name = 'FK_ISTORIJA_PRIJAVA K_KORISNIC')
alter table "Istorija logova pristupa"
   drop constraint "FK_ISTORIJA_PRIJAVA K_KORISNIC"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Istorija logova pristupa"') and o.name = 'FK_ISTORIJA_PRIJAVA N_SISTEM I')
alter table "Istorija logova pristupa"
   drop constraint "FK_ISTORIJA_PRIJAVA N_SISTEM I"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Istorija logova pristupa"') and o.name = 'FK_ISTORIJA_PRIJAVA U_ORGANIZA')
alter table "Istorija logova pristupa"
   drop constraint "FK_ISTORIJA_PRIJAVA U_ORGANIZA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Istorija odrzavanja"') and o.name = 'FK_ODRZAVANJE_ISTORIJA _ODRZAVANJA')
alter table "Istorija odrzavanja"
   drop constraint "FK_ODRZAVANJE_ISTORIJA _ODRZAVANJA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Istorija odrzavanja"') and o.name = 'FK_ISTORIJA_ODRZAVANJA_VOZILO')
alter table "Istorija odrzavanja"
   drop constraint FK_ISTORIJA_ODRZAVANJA_VOZILO
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Istorija posiljke"') and o.name = 'FK_ISTORIJA_ISTORIJA _STATUS P')
alter table "Istorija posiljke"
   drop constraint "FK_ISTORIJA_ISTORIJA _STATUS P"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Istorija posiljke"') and o.name = 'FK_ISTORIJA_PARAMETRI_POSILJKA')
alter table "Istorija posiljke"
   drop constraint FK_ISTORIJA_PARAMETRI_POSILJKA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Istorija posiljke"') and o.name = 'FK_ISTORIJA_POSILJKE _ZAPOSLENI')
alter table "Istorija posiljke"
   drop constraint "FK_ISTORIJA_POSILJKE _ZAPOSLENI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Istorija reklamacija"') and o.name = 'FK_ISTORIJA_ISTORIJA _EVIDENCI')
alter table "Istorija reklamacija"
   drop constraint "FK_ISTORIJA_ISTORIJA _EVIDENCI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Istorija reklamacija"') and o.name = 'FK_ISTORIJA_ISTORIJA _STATUS R')
alter table "Istorija reklamacija"
   drop constraint "FK_ISTORIJA_ISTORIJA _STATUS R"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Istorija reklamacija"') and o.name = 'FK_ISTORIJA_ZAPOSLENI_REGISTAR')
alter table "Istorija reklamacija"
   drop constraint FK_ISTORIJA_ZAPOSLENI_REGISTAR
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Istorija transport posiljke"') and o.name = 'FK_ISTORIJA_ISTORIJA _POSILJKA')
alter table "Istorija transport posiljke"
   drop constraint "FK_ISTORIJA_ISTORIJA _POSILJKA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Istorija transport posiljke"') and o.name = 'FK_ISTORIJA_ISTORIJA _VOZILO')
alter table "Istorija transport posiljke"
   drop constraint "FK_ISTORIJA_ISTORIJA _VOZILO"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Istorija uredenja"') and o.name = 'FK_ISTORIJA_KROZ ISTO_DRZAVA')
alter table "Istorija uredenja"
   drop constraint "FK_ISTORIJA_KROZ ISTO_DRZAVA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Istorija uredenja"') and o.name = 'FK_ISTORIJA_UREĞENJE _DRAVNO')
alter table "Istorija uredenja"
   drop constraint "FK_ISTORIJA_UREĞENJE _DRAVNO"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Izabrani tipovi organizacione jedinice"') and o.name = 'FK_IZABRANI_IZABRANA _TIP ORGA')
alter table "Izabrani tipovi organizacione jedinice"
   drop constraint "FK_IZABRANI_IZABRANA _TIP ORGA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Izabrani tipovi organizacione jedinice"') and o.name = 'FK_IZABRANI_IZBOR TIP_POSLOVNI')
alter table "Izabrani tipovi organizacione jedinice"
   drop constraint "FK_IZABRANI_IZBOR TIP_POSLOVNI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Katalog radnih mjesta"') and o.name = 'FK_KATALOG _IMA RADNA_POSLOVNI')
alter table "Katalog radnih mjesta"
   drop constraint "FK_KATALOG _IMA RADNA_POSLOVNI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Katalog zanimanja"') and o.name = 'FK_KATALOG _REGISTROV_DRZAVA')
alter table "Katalog zanimanja"
   drop constraint "FK_KATALOG _REGISTROV_DRZAVA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Katalog zvanja"') and o.name = 'FK_KATALOG _KATALOG Z_DRZAVA')
alter table "Katalog zvanja"
   drop constraint "FK_KATALOG _KATALOG Z_DRZAVA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Klijent') and o.name = 'FK_KLIJENT_FIZICKO L_FIZICKO')
alter table Klijent
   drop constraint "FK_KLIJENT_FIZICKO L_FIZICKO"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Klijent') and o.name = 'FK_KLIJENT_PRAVNO LI_PRAVNO L')
alter table Klijent
   drop constraint "FK_KLIJENT_PRAVNO LI_PRAVNO L"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Klijent') and o.name = 'FK_KLIJENT_TIP KLIJE_TIP KLIJ')
alter table Klijent
   drop constraint "FK_KLIJENT_TIP KLIJE_TIP KLIJ"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Korisnicki nalog"') and o.name = 'FK_KORISNIC_NALOG ZAP_REGISTAR')
alter table "Korisnicki nalog"
   drop constraint "FK_KORISNIC_NALOG ZAP_REGISTAR"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Korisnicki nalog"') and o.name = 'FK_KORISNIC_REGISTROV_POSLOVNI')
alter table "Korisnicki nalog"
   drop constraint FK_KORISNIC_REGISTROV_POSLOVNI
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Lista zvanja"') and o.name = 'FK_LISTA ZV_LISTA ZVA_ŠKOLSKA')
alter table "Lista zvanja"
   drop constraint "FK_LISTA ZV_LISTA ZVA_ŠKOLSKA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Lista zvanja"') and o.name = 'FK_LISTA ZV_LISTA ZVA_KATALOG')
alter table "Lista zvanja"
   drop constraint "FK_LISTA ZV_LISTA ZVA_KATALOG"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Mjesna zajednica"') and o.name = 'FK_MJESNA Z_IMA MJESN_OPŠTINA')
alter table "Mjesna zajednica"
   drop constraint "FK_MJESNA Z_IMA MJESN_OPŠTINA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Mjesna zajednica"') and o.name = 'FK_MJESNA Z_SJEDIŠTE _NASELJEN')
alter table "Mjesna zajednica"
   drop constraint "FK_MJESNA Z_SJEDIŠTE _NASELJEN"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Mjesno pokrivanje naselja"') and o.name = 'FK_MJESNO P_MJESNO PO_MJESNA Z')
alter table "Mjesno pokrivanje naselja"
   drop constraint "FK_MJESNO P_MJESNO PO_MJESNA Z"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Mjesno pokrivanje naselja"') and o.name = 'FK_MJESNO P_MJESNO PO_NASELJEN')
alter table "Mjesno pokrivanje naselja"
   drop constraint "FK_MJESNO P_MJESNO PO_NASELJEN"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Naseljeno mjesto"') and o.name = 'FK_NASELJEN_SADRI NA_DRZAVA')
alter table "Naseljeno mjesto"
   drop constraint "FK_NASELJEN_SADRI NA_DRZAVA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Obrazuju za"') and o.name = 'FK_OBRAZUJU_OBRAZUJU _ŠKOLSKA')
alter table "Obrazuju za"
   drop constraint "FK_OBRAZUJU_OBRAZUJU _ŠKOLSKA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Obrazuju za"') and o.name = 'FK_OBRAZUJU_OBRAZUJU _POSLOVNI')
alter table "Obrazuju za"
   drop constraint "FK_OBRAZUJU_OBRAZUJU _POSLOVNI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Obuhvata naselja"') and o.name = 'FK_OBUHVATA_NASELJENO_MJESTO')
alter table "Obuhvata naselja"
   drop constraint FK_OBUHVATA_NASELJENO_MJESTO
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Obuhvata naselja"') and o.name = 'FK_OBUHVATA_OBUHVATA _REGION')
alter table "Obuhvata naselja"
   drop constraint "FK_OBUHVATA_OBUHVATA _REGION"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Obuhvata opštine"') and o.name = 'FK_OBUHVATA_OBUHVATA _OPŠTINA')
alter table "Obuhvata opštine"
   drop constraint "FK_OBUHVATA_OBUHVATA _OPŠTINA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Obuhvata opštine"') and o.name = 'FK_OBUHVATA_OBUHVATA _NASELJEN')
alter table "Obuhvata opštine"
   drop constraint "FK_OBUHVATA_OBUHVATA _NASELJEN"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Odnos radnih mjesta"') and o.name = 'FK_ODNOS RA_NADREDJEN_KATALOG')
alter table "Odnos radnih mjesta"
   drop constraint "FK_ODNOS RA_NADREDJEN_KATALOG"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Odnos radnih mjesta"') and o.name = 'FK_ODNOS RA_ODNOS RAD_SISTEMAT')
alter table "Odnos radnih mjesta"
   drop constraint "FK_ODNOS RA_ODNOS RAD_SISTEMAT"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Odnos radnih mjesta"') and o.name = 'FK_ODNOS RA_PODREDJEN_KATALOG')
alter table "Odnos radnih mjesta"
   drop constraint "FK_ODNOS RA_PODREDJEN_KATALOG"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Odrzavanje vozila"') and o.name = 'FK_ODRZAVANJE _VOZILO')
alter table "Odrzavanje vozila"
   drop constraint "FK_ODRZAVANJE _VOZILO"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Opština') and o.name = 'FK_OPŠTINA_LOKALNA S_DRZAVA')
alter table Opština
   drop constraint "FK_OPŠTINA_LOKALNA S_DRZAVA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Opština') and o.name = 'FK_OPŠTINA_SJEDIŠTE _NASELJEN')
alter table Opština
   drop constraint "FK_OPŠTINA_SJEDIŠTE _NASELJEN"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Organizaciona jedinica"') and o.name = 'FK_ORGANIZA_SJEDIŠTE _NASELJEN')
alter table "Organizaciona jedinica"
   drop constraint "FK_ORGANIZA_SJEDIŠTE _NASELJEN"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Organizaciona jedinica"') and o.name = 'FK_ORGANIZA_TIPIZACIJ_IZABRANI')
alter table "Organizaciona jedinica"
   drop constraint FK_ORGANIZA_TIPIZACIJ_IZABRANI
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Organizaciona jedinica"') and o.name = 'FK_ORGANIZA_UNUTRAŠNJ_POSLOVNI')
alter table "Organizaciona jedinica"
   drop constraint FK_ORGANIZA_UNUTRAŠNJ_POSLOVNI
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Personalna restrikcija"') and o.name = 'FK_PERSONAL_PERSONALN_ATRIBUT')
alter table "Personalna restrikcija"
   drop constraint FK_PERSONAL_PERSONALN_ATRIBUT
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Personalna restrikcija"') and o.name = 'FK_PERSONAL_PERSONALN_PRIPADA')
alter table "Personalna restrikcija"
   drop constraint FK_PERSONAL_PERSONALN_PRIPADA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Personalna restrikcija"') and o.name = 'FK_PERSONAL_PERSONALN_TABELA')
alter table "Personalna restrikcija"
   drop constraint FK_PERSONAL_PERSONALN_TABELA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Podaci o obrazovanju"') and o.name = 'FK_PODACI O_OBRAZOVNA_POSLOVNI')
alter table "Podaci o obrazovanju"
   drop constraint "FK_PODACI O_OBRAZOVNA_POSLOVNI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Podaci o obrazovanju"') and o.name = 'FK_PODACI O_PODACI O _REGISTAR')
alter table "Podaci o obrazovanju"
   drop constraint "FK_PODACI O_PODACI O _REGISTAR"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Podaci o obrazovanju"') and o.name = 'FK_PODACI O_TIPIZACIJ_KATALOG')
alter table "Podaci o obrazovanju"
   drop constraint "FK_PODACI O_TIPIZACIJ_KATALOG"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Podaci o obrazovanju"') and o.name = 'FK_PODACI O_TIPIZACIJ_ŠKOLSKA')
alter table "Podaci o obrazovanju"
   drop constraint "FK_PODACI O_TIPIZACIJ_ŠKOLSKA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Posiljka') and o.name = 'FK_POSILJKA_MJESTO DO_NASELJEN')
alter table Posiljka
   drop constraint "FK_POSILJKA_MJESTO DO_NASELJEN"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Posiljka') and o.name = 'FK_POSILJKA_PREDMET U_UGOVOR O')
alter table Posiljka
   drop constraint "FK_POSILJKA_PREDMET U_UGOVOR O"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Posiljka') and o.name = 'FK_POSILJKA_STATUS PO_STATUS P')
alter table Posiljka
   drop constraint "FK_POSILJKA_STATUS PO_STATUS P"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Posiljka') and o.name = 'FK_POSILJKA_STATUS RE_STATUS R')
alter table Posiljka
   drop constraint "FK_POSILJKA_STATUS RE_STATUS R"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Posiljka') and o.name = 'FK_POSILJKA_TIP POSIL_TIP POSI')
alter table Posiljka
   drop constraint "FK_POSILJKA_TIP POSIL_TIP POSI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Posiljka') and o.name = 'FK_POSILJKA_TIP TRANS_TIP TRAN')
alter table Posiljka
   drop constraint "FK_POSILJKA_TIP TRANS_TIP TRAN"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Posiljke u transportu"') and o.name = 'FK_POSILJKE_POSILJKA _POSILJKA')
alter table "Posiljke u transportu"
   drop constraint "FK_POSILJKE_POSILJKA _POSILJKA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Posiljke u transportu"') and o.name = 'FK_POSILJKE_VOZILO SA_VOZILO')
alter table "Posiljke u transportu"
   drop constraint "FK_POSILJKE_VOZILO SA_VOZILO"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Poslovni sistem"') and o.name = 'FK_POSLOVNI_DRZAVA PO_DRZAVA')
alter table "Poslovni sistem"
   drop constraint "FK_POSLOVNI_DRZAVA PO_DRZAVA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Poslovni sistem"') and o.name = 'FK_POSLOVNI_PRAVNI SL_POSLOVNI')
alter table "Poslovni sistem"
   drop constraint "FK_POSLOVNI_PRAVNI SL_POSLOVNI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Poslovni sistem"') and o.name = 'FK_POSLOVNI_SJEDIŠTE _NASELJEN')
alter table "Poslovni sistem"
   drop constraint "FK_POSLOVNI_SJEDIŠTE _NASELJEN"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Poslovni sistem"') and o.name = 'FK_POSLOVNI_TIPIZACIJ_TIP POSL')
alter table "Poslovni sistem"
   drop constraint "FK_POSLOVNI_TIPIZACIJ_TIP POSL"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Potrebna školska sprema"') and o.name = 'FK_POTREBNA_POTREBNA _KATALOG')
alter table "Potrebna školska sprema"
   drop constraint "FK_POTREBNA_POTREBNA _KATALOG"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Potrebna školska sprema"') and o.name = 'FK_POTREBNA_POTREBNA _ŠKOLSKA')
alter table "Potrebna školska sprema"
   drop constraint "FK_POTREBNA_POTREBNA _ŠKOLSKA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Potrebne spreme"') and o.name = 'FK_POTREBNE_POTREBNE _ŠKOLSKA')
alter table "Potrebne spreme"
   drop constraint "FK_POTREBNE_POTREBNE _ŠKOLSKA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Potrebne spreme"') and o.name = 'FK_POTREBNE_POTREBNE _KATALOG')
alter table "Potrebne spreme"
   drop constraint "FK_POTREBNE_POTREBNE _KATALOG"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Povezana sa"') and o.name = 'FK_POVEZANA_SA _TABELOM')
alter table "Povezana sa"
   drop constraint "FK_POVEZANA_SA _TABELOM"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Povezana sa"') and o.name = 'FK_POVEZANA_TABELA')
alter table "Povezana sa"
   drop constraint FK_POVEZANA_TABELA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Pravni nasljednik"') and o.name = 'FK_PRAVNI NASLJEDNIK_DRZAVA')
alter table "Pravni nasljednik"
   drop constraint "FK_PRAVNI NASLJEDNIK_DRZAVA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Pravni nasljednik"') and o.name = 'FK_PRAVNI N_PRAVNI NA_DRZAVA')
alter table "Pravni nasljednik"
   drop constraint "FK_PRAVNI N_PRAVNI NA_DRZAVA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Pravo na podsistem"') and o.name = 'FK_PRAVO NA_PRAVO NA _SISTEM I')
alter table "Pravo na podsistem"
   drop constraint "FK_PRAVO NA_PRAVO NA _SISTEM I"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Pravo na podsistem"') and o.name = 'FK_PRAVO NA_PRAVO NA _ROLA')
alter table "Pravo na podsistem"
   drop constraint "FK_PRAVO NA_PRAVO NA _ROLA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Predefinisane role radnih mjesta"') and o.name = 'FK_PREDEFIN_PREDEFINI_ROLA')
alter table "Predefinisane role radnih mjesta"
   drop constraint FK_PREDEFIN_PREDEFINI_ROLA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Predefinisane role radnih mjesta"') and o.name = 'FK_PREDEFIN_PREDEFINI_KATALOG')
alter table "Predefinisane role radnih mjesta"
   drop constraint FK_PREDEFIN_PREDEFINI_KATALOG
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Pripada roli"') and o.name = 'FK_PRIPADA _KO JE U G_ROLA')
alter table "Pripada roli"
   drop constraint "FK_PRIPADA _KO JE U G_ROLA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Pripada roli"') and o.name = 'FK_PRIPADA _SVRSTAN U_KORISNIC')
alter table "Pripada roli"
   drop constraint "FK_PRIPADA _SVRSTAN U_KORISNIC"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Radna mjesta u Organizacionoj jedinici"') and o.name = 'FK_RADNA MJ_ORGANIZAC_ORGANIZA')
alter table "Radna mjesta u Organizacionoj jedinici"
   drop constraint "FK_RADNA MJ_ORGANIZAC_ORGANIZA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Radna mjesta u Organizacionoj jedinici"') and o.name = 'FK_RADNA MJ_RADNO MJE_KATALOG')
alter table "Radna mjesta u Organizacionoj jedinici"
   drop constraint "FK_RADNA MJ_RADNO MJE_KATALOG"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Raspored na radna mjesta"') and o.name = 'FK_RASPORED_KADROVI U_ORGANIZA')
alter table "Raspored na radna mjesta"
   drop constraint "FK_RASPORED_KADROVI U_ORGANIZA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Raspored na radna mjesta"') and o.name = 'FK_RASPORED_RASPORED _KATALOG')
alter table "Raspored na radna mjesta"
   drop constraint "FK_RASPORED_RASPORED _KATALOG"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Raspored na radna mjesta"') and o.name = 'FK_RASPORED_RASPORED _REGISTAR')
alter table "Raspored na radna mjesta"
   drop constraint "FK_RASPORED_RASPORED _REGISTAR"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Raspored na radna mjesta"') and o.name = 'FK_RASPORED_TIPIZACIJ_VRSTA RA')
alter table "Raspored na radna mjesta"
   drop constraint "FK_RASPORED_TIPIZACIJ_VRSTA RA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Region') and o.name = 'FK_REGION_ADMINISTR_NASELJEN')
alter table Region
   drop constraint FK_REGION_ADMINISTR_NASELJEN
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Region') and o.name = 'FK_REGION_MATICNA D_DRZAVA')
alter table Region
   drop constraint "FK_REGION_MATICNA D_DRZAVA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Region') and o.name = 'FK_REGION_TIPIZACIJ_TIP REGI')
alter table Region
   drop constraint "FK_REGION_TIPIZACIJ_TIP REGI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Registar zaposlenih"') and o.name = 'FK_REGISTAR_ZAPOŠLJAV_POSLOVNI')
alter table "Registar zaposlenih"
   drop constraint FK_REGISTAR_ZAPOŠLJAV_POSLOVNI
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Restrikcija atributa"') and o.name = 'FK_RESTRIKCIJA_ROLA')
alter table "Restrikcija atributa"
   drop constraint FK_RESTRIKCIJA_ROLA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Restrikcija atributa"') and o.name = 'FK_RESTRIKC_RESTRIKCI_ATRIBUT')
alter table "Restrikcija atributa"
   drop constraint FK_RESTRIKC_RESTRIKCI_ATRIBUT
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Restrikcija nad tabelama"') and o.name = 'FK_RESTRIKCJA_NAD_ROLAMA')
alter table "Restrikcija nad tabelama"
   drop constraint FK_RESTRIKCJA_NAD_ROLAMA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Restrikcija nad tabelama"') and o.name = 'FK_RESTRIKC_RESTRIKCI_TABELA')
alter table "Restrikcija nad tabelama"
   drop constraint FK_RESTRIKC_RESTRIKCI_TABELA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Rola') and o.name = 'FK_ROLA_ROLE POSL_POSLOVNI')
alter table Rola
   drop constraint "FK_ROLA_ROLE POSL_POSLOVNI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sadri atribute"') and o.name = 'FK_SADRI A_SADRI AT_ATRIBUT')
alter table "Sadri atribute"
   drop constraint "FK_SADRI A_SADRI AT_ATRIBUT"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sadri atribute"') and o.name = 'FK_SADRI A_SADRI AT_TABELA')
alter table "Sadri atribute"
   drop constraint "FK_SADRI A_SADRI AT_TABELA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sadri podsisteme"') and o.name = 'FK_SADRI_SISTEM_SISTEM_PODSISTEM')
alter table "Sadri podsisteme"
   drop constraint FK_SADRI_SISTEM_SISTEM_PODSISTEM
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sadri podsisteme"') and o.name = 'FK_SADRI P_SADRI PO_SISTEM I')
alter table "Sadri podsisteme"
   drop constraint "FK_SADRI P_SADRI PO_SISTEM I"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sadri tabele"') and o.name = 'FK_SADRI T_SADRI TA_TABELA')
alter table "Sadri tabele"
   drop constraint "FK_SADRI T_SADRI TA_TABELA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sadri tabele"') and o.name = 'FK_SADRI T_SADRI TA_SISTEM I')
alter table "Sadri tabele"
   drop constraint "FK_SADRI T_SADRI TA_SISTEM I"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sastav drava"') and o.name = 'FK_SASTAV D_DRZAVA CL_DRZAVA')
alter table "Sastav drava"
   drop constraint "FK_SASTAV D_DRZAVA CL_DRZAVA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sastav drava"') and o.name = 'FK_SASTAV D_SLOENA D_DRZAVA')
alter table "Sastav drava"
   drop constraint "FK_SASTAV D_SLOENA D_DRZAVA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sastav regiona"') and o.name = 'FK_SASTAV_REGIONA_REGION')
alter table "Sastav regiona"
   drop constraint FK_SASTAV_REGIONA_REGION
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sastav regiona"') and o.name = 'FK_SASTAV R_SASTAV RE_REGION')
alter table "Sastav regiona"
   drop constraint "FK_SASTAV R_SASTAV RE_REGION"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sistem ili podsistem"') and o.name = 'FK_SISTEM I_RESURSI P_POSLOVNI')
alter table "Sistem ili podsistem"
   drop constraint "FK_SISTEM I_RESURSI P_POSLOVNI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Sistematizacija') and o.name = 'FK_SISTEMAT_SISTEMATI_POSLOVNI')
alter table Sistematizacija
   drop constraint FK_SISTEMAT_SISTEMATI_POSLOVNI
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sloena organizaciona jedinica"') and o.name = 'FK_SLOENA _JEDINICA_ORGANIZACIONA_JEDINICA')
alter table "Sloena organizaciona jedinica"
   drop constraint "FK_SLOENA _JEDINICA_ORGANIZACIONA_JEDINICA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sloena organizaciona jedinica"') and o.name = 'FK_SLOENA _SLOENA O_ORGANIZA')
alter table "Sloena organizaciona jedinica"
   drop constraint "FK_SLOENA _SLOENA O_ORGANIZA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sloeni poslovni sistem"') and o.name = 'FK_SLOENI _MATICNI P_POSLOVNI')
alter table "Sloeni poslovni sistem"
   drop constraint "FK_SLOENI _MATICNI P_POSLOVNI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sloeni poslovni sistem"') and o.name = 'FK_SLOENI _SISTEM U _POSLOVNI')
alter table "Sloeni poslovni sistem"
   drop constraint "FK_SLOENI _SISTEM U _POSLOVNI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sloeni poslovni sistem"') and o.name = 'FK_SLOENI _TIPIZACIJ_TIP SLO')
alter table "Sloeni poslovni sistem"
   drop constraint "FK_SLOENI _TIPIZACIJ_TIP SLO"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Struktura atributa"') and o.name = 'FK_STRUKTURA_ATRIBUTA_ATRIBUT')
alter table "Struktura atributa"
   drop constraint FK_STRUKTURA_ATRIBUTA_ATRIBUT
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Struktura atributa"') and o.name = 'FK_STRUKTUR_STRUKTURA_ATRIBUT')
alter table "Struktura atributa"
   drop constraint FK_STRUKTUR_STRUKTURA_ATRIBUT
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Tabela') and o.name = 'FK_TABELA_RESURSI P_POSLOVNI')
alter table Tabela
   drop constraint "FK_TABELA_RESURSI P_POSLOVNI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Ugovor o transportu"') and o.name = 'FK_UGOVOR O_ODGOVORNO_ORGANIZA')
alter table "Ugovor o transportu"
   drop constraint "FK_UGOVOR O_ODGOVORNO_ORGANIZA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Ugovor o transportu"') and o.name = 'FK_UGOVOR O_POSILJALA_KLIJENT')
alter table "Ugovor o transportu"
   drop constraint "FK_UGOVOR O_POSILJALA_KLIJENT"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Ugovor o transportu"') and o.name = 'FK_UGOVOR O_PRIMALAC2_KLIJENT')
alter table "Ugovor o transportu"
   drop constraint "FK_UGOVOR O_PRIMALAC2_KLIJENT"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Ugovor o transportu"') and o.name = 'FK_UGOVOR O_STRANKA_KLIJENT')
alter table "Ugovor o transportu"
   drop constraint "FK_UGOVOR O_STRANKA_KLIJENT"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Vozilo') and o.name = 'FK_VOZILO_TIP_VOZILA')
alter table Vozilo
   drop constraint FK_VOZILO_TIP_VOZILA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Vozilo') and o.name = 'FK_VOZILO_TIP TRANS_TIP TRAN')
alter table Vozilo
   drop constraint "FK_VOZILO_TIP TRANS_TIP TRAN"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Zaduzenje vozila"') and o.name = 'FK_ZADUZENJ_VOZILA_VOZILO')
alter table "Zaduzenje vozila"
   drop constraint FK_ZADUZENJ_VOZILA_VOZILO
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Zaduzenje vozila"') and o.name = 'FK_ZADUZENJE_VOZILA_ZAPOSLENI')
alter table "Zaduzenje vozila"
   drop constraint FK_ZADUZENJE_VOZILA_ZAPOSLENI
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Školska sprema"') and o.name = 'FK_ŠKOLSKA _KOJE ŠKOL_NIVO OBR')
alter table "Školska sprema"
   drop constraint "FK_ŠKOLSKA _KOJE ŠKOL_NIVO OBR"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Adresni podaci"')
            and   name  = 'MJESTO_ADRESE_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Adresni podaci".MJESTO_ADRESE_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Adresni podaci"')
            and   name  = 'KONTAKT_PODACI_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Adresni podaci".KONTAKT_PODACI_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Adresni podaci"')
            and   name  = 'KOD_DRUGOG_PRAVNOG_LICA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Adresni podaci".KOD_DRUGOG_PRAVNOG_LICA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Adresni podaci"')
            and   type = 'U')
   drop table "Adresni podaci"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Adresnica')
            and   name  = 'PRIMALAC_FK'
            and   indid > 0
            and   indid < 255)
   drop index Adresnica.PRIMALAC_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Adresnica')
            and   name  = 'POSILJALAC_FK'
            and   indid > 0
            and   indid < 255)
   drop index Adresnica.POSILJALAC_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Adresnica')
            and   name  = 'OBRAZAC_ADRESNICE_FK'
            and   indid > 0
            and   indid < 255)
   drop index Adresnica.OBRAZAC_ADRESNICE_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Adresnica')
            and   name  = 'NACIN_PREUZIMANJA_FK'
            and   indid > 0
            and   indid < 255)
   drop index Adresnica.NACIN_PREUZIMANJA_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Adresnica')
            and   name  = 'NACIN_PLACANJA_FK'
            and   indid > 0
            and   indid < 255)
   drop index Adresnica.NACIN_PLACANJA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Adresnica')
            and   type = 'U')
   drop table Adresnica
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Aktivne posiljke"')
            and   name  = 'JEDINICA_SADRZI_POSILLJKU_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Aktivne posiljke".JEDINICA_SADRZI_POSILLJKU_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Aktivne posiljke"')
            and   type = 'U')
   drop table "Aktivne posiljke"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Atribut')
            and   name  = 'RESURSI_POSLOVNOG_SISTEMA2_FK'
            and   indid > 0
            and   indid < 255)
   drop index Atribut.RESURSI_POSLOVNOG_SISTEMA2_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Atribut')
            and   type = 'U')
   drop table Atribut
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Carinska deklaracija"')
            and   name  = 'TIP_DEKLARACIJE_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Carinska deklaracija".TIP_DEKLARACIJE_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Carinska deklaracija"')
            and   name  = 'STATUS_DEKLARACIJE_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Carinska deklaracija".STATUS_DEKLARACIJE_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Carinska deklaracija"')
            and   name  = 'PREDMET_DEKLARACIJE_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Carinska deklaracija".PREDMET_DEKLARACIJE_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Carinska deklaracija"')
            and   name  = 'NALOGODAVAC_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Carinska deklaracija".NALOGODAVAC_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Carinska deklaracija"')
            and   name  = 'DEKLARACIJA_POSILJKE_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Carinska deklaracija".DEKLARACIJA_POSILJKE_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Carinska deklaracija"')
            and   type = 'U')
   drop table "Carinska deklaracija"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Carinska dokumentacija"')
            and   name  = 'VOZILO_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Carinska dokumentacija".VOZILO_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Carinska dokumentacija"')
            and   name  = 'VOZAC_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Carinska dokumentacija".VOZAC_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Carinska dokumentacija"')
            and   name  = 'MJESTO_DOSTAVE2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Carinska dokumentacija".MJESTO_DOSTAVE2_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Carinska dokumentacija"')
            and   type = 'U')
   drop table "Carinska dokumentacija"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Drzava')
            and   name  = 'TEKUCE_URE_ENJE_FK'
            and   indid > 0
            and   indid < 255)
   drop index Drzava.TEKUCE_URE_ENJE_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Drzava')
            and   name  = 'AKTUELNI_GLAVNI_GRAD_FK'
            and   indid > 0
            and   indid < 255)
   drop index Drzava.AKTUELNI_GLAVNI_GRAD_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Drzava')
            and   type = 'U')
   drop table Drzava
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Dravljanstvo')
            and   name  = 'DRZAVLJANSTVO_FK'
            and   indid > 0
            and   indid < 255)
   drop index Dravljanstvo.DRZAVLJANSTVO_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Dravljanstvo')
            and   name  = 'DRZAVLJANSTVO2_FK'
            and   indid > 0
            and   indid < 255)
   drop index Dravljanstvo.DRZAVLJANSTVO2_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Dravljanstvo')
            and   type = 'U')
   drop table Dravljanstvo
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Dravno uredenje"')
            and   type = 'U')
   drop table "Dravno uredenje"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Evidencija posiljki"')
            and   name  = 'SADRZI_POSILJKU_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Evidencija posiljki".SADRZI_POSILJKU_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Evidencija posiljki"')
            and   name  = 'EVIDENCIJA_POSILJKA_U_JEDINICI_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Evidencija posiljki".EVIDENCIJA_POSILJKA_U_JEDINICI_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Evidencija posiljki"')
            and   type = 'U')
   drop table "Evidencija posiljki"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Evidencija reklamacija"')
            and   name  = 'SVRHA_REKLAMACIJE_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Evidencija reklamacija".SVRHA_REKLAMACIJE_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Evidencija reklamacija"')
            and   name  = 'REKLAMACIJA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Evidencija reklamacija".REKLAMACIJA_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Evidencija reklamacija"')
            and   name  = 'PREDMET_REKLAMACIJE_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Evidencija reklamacija".PREDMET_REKLAMACIJE_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Evidencija reklamacija"')
            and   name  = 'ISTORIJA_STATUSA_REKLAMACIJE_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Evidencija reklamacija".ISTORIJA_STATUSA_REKLAMACIJE_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Evidencija reklamacija"')
            and   type = 'U')
   drop table "Evidencija reklamacija"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Fizicko lice"')
            and   type = 'U')
   drop table "Fizicko lice"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Flota vozila"')
            and   name  = 'VOZILO_U_FLOTI_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Flota vozila".VOZILO_U_FLOTI_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Flota vozila"')
            and   name  = 'FLOTA_VOZILA_ORGANIZACIONE_JEDINICE_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Flota vozila".FLOTA_VOZILA_ORGANIZACIONE_JEDINICE_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Flota vozila"')
            and   type = 'U')
   drop table "Flota vozila"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Glavni grad"')
            and   name  = 'GLAVNI_GRAD_U_DRZAVI_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Glavni grad".GLAVNI_GRAD_U_DRZAVI_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Glavni grad"')
            and   name  = 'GLAVNI_GRAD_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Glavni grad".GLAVNI_GRAD_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Glavni grad"')
            and   type = 'U')
   drop table "Glavni grad"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Istorija adresnice"')
            and   name  = 'PROMJENA_ADRESNICE_OD_STRANE_ZAPOSLENOG_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija adresnice".PROMJENA_ADRESNICE_OD_STRANE_ZAPOSLENOG_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Istorija adresnice"')
            and   name  = 'POSILJKA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija adresnice".POSILJKA_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Istorija adresnice"')
            and   name  = 'OBRAZAC_ADRESNICE2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija adresnice".OBRAZAC_ADRESNICE2_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Istorija adresnice"')
            and   type = 'U')
   drop table "Istorija adresnice"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Istorija akcija"')
            and   name  = 'ISTORIJA_AKCIJA_U_JEDINICI_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija akcija".ISTORIJA_AKCIJA_U_JEDINICI_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Istorija akcija"')
            and   name  = 'ISTORIJA_AKCIJA_KORISNIKA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija akcija".ISTORIJA_AKCIJA_KORISNIKA_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Istorija akcija"')
            and   name  = 'AKCIJA_NAD_TABELOM_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija akcija".AKCIJA_NAD_TABELOM_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Istorija akcija"')
            and   type = 'U')
   drop table "Istorija akcija"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Istorija deklaracije"')
            and   name  = 'PROMJENA_DEKLARACIJE_OD_STRANE_ZAPOSLENOG_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija deklaracije".PROMJENA_DEKLARACIJE_OD_STRANE_ZAPOSLENOG_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Istorija deklaracije"')
            and   name  = 'ISTORIJA_STATUSA_DEKLARACIJE_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija deklaracije".ISTORIJA_STATUSA_DEKLARACIJE_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Istorija deklaracije"')
            and   name  = 'CARINSKA_DEKLARACIJA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija deklaracije".CARINSKA_DEKLARACIJA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Istorija deklaracije"')
            and   type = 'U')
   drop table "Istorija deklaracije"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Istorija izmjena"')
            and   name  = 'IZMJENE_NAD_TABELOM_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija izmjena".IZMJENE_NAD_TABELOM_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Istorija izmjena"')
            and   name  = 'IZMJENA_U_JEDINICI_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija izmjena".IZMJENA_U_JEDINICI_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Istorija izmjena"')
            and   name  = 'ISTORIJA_IZMJENA_KORISNIKA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija izmjena".ISTORIJA_IZMJENA_KORISNIKA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Istorija izmjena"')
            and   type = 'U')
   drop table "Istorija izmjena"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Istorija logova pristupa"')
            and   name  = 'PRIJAVA_U_JEDINICI_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija logova pristupa".PRIJAVA_U_JEDINICI_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Istorija logova pristupa"')
            and   name  = 'PRIJAVA_NA_SISTEM_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija logova pristupa".PRIJAVA_NA_SISTEM_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Istorija logova pristupa"')
            and   name  = 'PRIJAVA_KORISNIKA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija logova pristupa".PRIJAVA_KORISNIKA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Istorija logova pristupa"')
            and   type = 'U')
   drop table "Istorija logova pristupa"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Istorija odrzavanja"')
            and   name  = 'ODRZAVANO_VOZILO_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija odrzavanja".ODRZAVANO_VOZILO_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Istorija odrzavanja"')
            and   name  = 'ISTORIJA_ODZAVANJA_VOZILA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija odrzavanja".ISTORIJA_ODZAVANJA_VOZILA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Istorija odrzavanja"')
            and   type = 'U')
   drop table "Istorija odrzavanja"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Istorija posiljke"')
            and   name  = 'PROMJENA_POSILJKE_OD_STRANE_ZAPOSLENOG_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija posiljke".PROMJENA_POSILJKE_OD_STRANE_ZAPOSLENOG_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Istorija posiljke"')
            and   name  = 'PARAMETRI_POSILJKE_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija posiljke".PARAMETRI_POSILJKE_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Istorija posiljke"')
            and   name  = 'ISTORIJA_STATUSA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija posiljke".ISTORIJA_STATUSA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Istorija posiljke"')
            and   type = 'U')
   drop table "Istorija posiljke"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Istorija reklamacija"')
            and   name  = 'ZAPOSLENI_OTVORIO_REKLAMACIJU_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija reklamacija".ZAPOSLENI_OTVORIO_REKLAMACIJU_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Istorija reklamacija"')
            and   name  = 'ISTORIJA_STATUSA_REKLAMACIJE2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija reklamacija".ISTORIJA_STATUSA_REKLAMACIJE2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Istorija reklamacija"')
            and   name  = 'ISTORIJA_REKLAMACIJE_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija reklamacija".ISTORIJA_REKLAMACIJE_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Istorija reklamacija"')
            and   type = 'U')
   drop table "Istorija reklamacija"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Istorija transport posiljke"')
            and   name  = 'ISTORIJA_VOZILA_KOJE_SADRZI_POSILJKU_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija transport posiljke".ISTORIJA_VOZILA_KOJE_SADRZI_POSILJKU_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Istorija transport posiljke"')
            and   name  = 'ISTORIJA_POSILJKE_U_VOZILU_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija transport posiljke".ISTORIJA_POSILJKE_U_VOZILU_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Istorija transport posiljke"')
            and   type = 'U')
   drop table "Istorija transport posiljke"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Istorija uredenja"')
            and   name  = 'URE_ENJE_DRZAVE_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija uredenja".URE_ENJE_DRZAVE_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Istorija uredenja"')
            and   name  = 'KROZ_ISTORIJU_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija uredenja".KROZ_ISTORIJU_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Istorija uredenja"')
            and   type = 'U')
   drop table "Istorija uredenja"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Izabrani tipovi organizacione jedinice"')
            and   name  = 'IZBOR_TIPIZACIJE_PO_POSLOVNOM_SISTEMU_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Izabrani tipovi organizacione jedinice".IZBOR_TIPIZACIJE_PO_POSLOVNOM_SISTEMU_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Izabrani tipovi organizacione jedinice"')
            and   name  = 'IZABRANA_TIPIZACIJA_ORGANIZACIONE_JEDINICE_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Izabrani tipovi organizacione jedinice".IZABRANA_TIPIZACIJA_ORGANIZACIONE_JEDINICE_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Izabrani tipovi organizacione jedinice"')
            and   type = 'U')
   drop table "Izabrani tipovi organizacione jedinice"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Katalog radnih mjesta"')
            and   name  = 'IMA_RADNA_MJESTA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Katalog radnih mjesta".IMA_RADNA_MJESTA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Katalog radnih mjesta"')
            and   type = 'U')
   drop table "Katalog radnih mjesta"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Katalog zanimanja"')
            and   name  = 'REGISTROVANA_ZANIMANJA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Katalog zanimanja".REGISTROVANA_ZANIMANJA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Katalog zanimanja"')
            and   type = 'U')
   drop table "Katalog zanimanja"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Katalog zvanja"')
            and   name  = 'KATALOG_ZVANJA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Katalog zvanja".KATALOG_ZVANJA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Katalog zvanja"')
            and   type = 'U')
   drop table "Katalog zvanja"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Klijent')
            and   name  = 'TIP_KLIJENTA_FK'
            and   indid > 0
            and   indid < 255)
   drop index Klijent.TIP_KLIJENTA_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Klijent')
            and   name  = 'PRAVNO_LICE_FK'
            and   indid > 0
            and   indid < 255)
   drop index Klijent.PRAVNO_LICE_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Klijent')
            and   name  = 'FIZICKO_LICE_FK'
            and   indid > 0
            and   indid < 255)
   drop index Klijent.FIZICKO_LICE_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Klijent')
            and   type = 'U')
   drop table Klijent
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Korisnicki nalog"')
            and   name  = 'REGISTROVANI_KORISNICI_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Korisnicki nalog".REGISTROVANI_KORISNICI_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Korisnicki nalog"')
            and   name  = 'NALOG_ZAPOSLENOG_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Korisnicki nalog".NALOG_ZAPOSLENOG_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Korisnicki nalog"')
            and   type = 'U')
   drop table "Korisnicki nalog"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Lista zvanja"')
            and   name  = 'LISTA_ZVANJA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Lista zvanja".LISTA_ZVANJA_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Lista zvanja"')
            and   name  = 'LISTA_ZVANJA2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Lista zvanja".LISTA_ZVANJA2_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Lista zvanja"')
            and   type = 'U')
   drop table "Lista zvanja"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Mjesna zajednica"')
            and   name  = 'SJEDISTE_MJESNE_ZAJEDNICE_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Mjesna zajednica".SJEDISTE_MJESNE_ZAJEDNICE_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Mjesna zajednica"')
            and   name  = 'IMA_MJESNE_ZAJEDNICE_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Mjesna zajednica".IMA_MJESNE_ZAJEDNICE_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Mjesna zajednica"')
            and   type = 'U')
   drop table "Mjesna zajednica"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Mjesno pokrivanje naselja"')
            and   name  = 'MJESNO_POKRIVANJE_NASELJA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Mjesno pokrivanje naselja".MJESNO_POKRIVANJE_NASELJA_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Mjesno pokrivanje naselja"')
            and   name  = 'MJESNO_POKRIVANJE_NASELJA2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Mjesno pokrivanje naselja".MJESNO_POKRIVANJE_NASELJA2_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Mjesno pokrivanje naselja"')
            and   type = 'U')
   drop table "Mjesno pokrivanje naselja"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Nacin placanja posiljke"')
            and   type = 'U')
   drop table "Nacin placanja posiljke"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Nacin preuzimanja"')
            and   type = 'U')
   drop table "Nacin preuzimanja"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Naseljeno mjesto"')
            and   name  = 'SADRZI_NASELJA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Naseljeno mjesto".SADRZI_NASELJA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Naseljeno mjesto"')
            and   type = 'U')
   drop table "Naseljeno mjesto"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Nivo obrazovanja"')
            and   type = 'U')
   drop table "Nivo obrazovanja"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Obrazuju za"')
            and   name  = 'OBRAZUJU_ZA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Obrazuju za".OBRAZUJU_ZA_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Obrazuju za"')
            and   name  = 'OBRAZUJU_ZA2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Obrazuju za".OBRAZUJU_ZA2_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Obrazuju za"')
            and   type = 'U')
   drop table "Obrazuju za"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Obuhvata naselja"')
            and   name  = 'OBUHVATA_NASELJA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Obuhvata naselja".OBUHVATA_NASELJA_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Obuhvata naselja"')
            and   name  = 'OBUHVATA_NASELJA2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Obuhvata naselja".OBUHVATA_NASELJA2_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Obuhvata naselja"')
            and   type = 'U')
   drop table "Obuhvata naselja"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Obuhvata opštine"')
            and   name  = 'OBUHVATA_OPSTINE_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Obuhvata opštine".OBUHVATA_OPSTINE_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Obuhvata opštine"')
            and   name  = 'OBUHVATA_OPSTINE2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Obuhvata opštine".OBUHVATA_OPSTINE2_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Obuhvata opštine"')
            and   type = 'U')
   drop table "Obuhvata opštine"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Odnos radnih mjesta"')
            and   name  = 'PODREDJENI_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Odnos radnih mjesta".PODREDJENI_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Odnos radnih mjesta"')
            and   name  = 'ODNOS_RADNIH_MJESTA_U_SISTEMATIZACIJI_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Odnos radnih mjesta".ODNOS_RADNIH_MJESTA_U_SISTEMATIZACIJI_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Odnos radnih mjesta"')
            and   name  = 'NADREDJENI_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Odnos radnih mjesta".NADREDJENI_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Odnos radnih mjesta"')
            and   type = 'U')
   drop table "Odnos radnih mjesta"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Odrzavanje vozila"')
            and   name  = 'PODACI_O_ODRZAVANJU_VOZILA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Odrzavanje vozila".PODACI_O_ODRZAVANJU_VOZILA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Odrzavanje vozila"')
            and   type = 'U')
   drop table "Odrzavanje vozila"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Opština')
            and   name  = 'SJEDISTE_OPSTINE_FK'
            and   indid > 0
            and   indid < 255)
   drop index Opština.SJEDISTE_OPSTINE_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Opština')
            and   name  = 'LOKALNA_SAMOUPRAVA_FK'
            and   indid > 0
            and   indid < 255)
   drop index Opština.LOKALNA_SAMOUPRAVA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Opština')
            and   type = 'U')
   drop table Opština
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Organizaciona jedinica"')
            and   name  = 'UNUTRASNJA_ORGANIZACIJA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Organizaciona jedinica".UNUTRASNJA_ORGANIZACIJA_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Organizaciona jedinica"')
            and   name  = 'TIPIZACIJA_ORGANIZACIONE_JEDINICE_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Organizaciona jedinica".TIPIZACIJA_ORGANIZACIONE_JEDINICE_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Organizaciona jedinica"')
            and   name  = 'SJEDISTE_ORGANIZACIONE_JEDINICE_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Organizaciona jedinica".SJEDISTE_ORGANIZACIONE_JEDINICE_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Organizaciona jedinica"')
            and   type = 'U')
   drop table "Organizaciona jedinica"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Personalna restrikcija"')
            and   name  = 'PERSONALNA_RESTRIKCIJA3_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Personalna restrikcija".PERSONALNA_RESTRIKCIJA3_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Personalna restrikcija"')
            and   name  = 'PERSONALNA_RESTRIKCIJA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Personalna restrikcija".PERSONALNA_RESTRIKCIJA_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Personalna restrikcija"')
            and   name  = 'PERSONALNA_RESTRIKCIJA2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Personalna restrikcija".PERSONALNA_RESTRIKCIJA2_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Personalna restrikcija"')
            and   type = 'U')
   drop table "Personalna restrikcija"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Podaci o obrazovanju"')
            and   name  = 'TIPIZACIJA_SKOLSKE_SPREMA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Podaci o obrazovanju".TIPIZACIJA_SKOLSKE_SPREMA_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Podaci o obrazovanju"')
            and   name  = 'TIPIZACIJA_ZVANJA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Podaci o obrazovanju".TIPIZACIJA_ZVANJA_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Podaci o obrazovanju"')
            and   name  = 'PODACI_O_OBRAZOVANJU_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Podaci o obrazovanju".PODACI_O_OBRAZOVANJU_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Podaci o obrazovanju"')
            and   name  = 'OBRAZOVNA_USTANOVA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Podaci o obrazovanju".OBRAZOVNA_USTANOVA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Podaci o obrazovanju"')
            and   type = 'U')
   drop table "Podaci o obrazovanju"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Posiljka')
            and   name  = 'TIP_TRANSPORTA_POSILJKE_FK'
            and   indid > 0
            and   indid < 255)
   drop index Posiljka.TIP_TRANSPORTA_POSILJKE_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Posiljka')
            and   name  = 'TIP_POSILJKE_FK'
            and   indid > 0
            and   indid < 255)
   drop index Posiljka.TIP_POSILJKE_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Posiljka')
            and   name  = 'STATUS_REKLAMACIJE_FK'
            and   indid > 0
            and   indid < 255)
   drop index Posiljka.STATUS_REKLAMACIJE_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Posiljka')
            and   name  = 'STATUS_POSILJKE_FK'
            and   indid > 0
            and   indid < 255)
   drop index Posiljka.STATUS_POSILJKE_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Posiljka')
            and   name  = 'PREDMET_UGOVORA_FK'
            and   indid > 0
            and   indid < 255)
   drop index Posiljka.PREDMET_UGOVORA_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Posiljka')
            and   name  = 'MJESTO_DOSTAVE_FK'
            and   indid > 0
            and   indid < 255)
   drop index Posiljka.MJESTO_DOSTAVE_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Posiljka')
            and   type = 'U')
   drop table Posiljka
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Posiljke u transportu"')
            and   name  = 'VOZILO_SADRZI_POSILJKU_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Posiljke u transportu".VOZILO_SADRZI_POSILJKU_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Posiljke u transportu"')
            and   type = 'U')
   drop table "Posiljke u transportu"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Poslovni sistem"')
            and   name  = 'TIPIZACIJA_POSLOVNOG_SISTEMA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Poslovni sistem".TIPIZACIJA_POSLOVNOG_SISTEMA_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Poslovni sistem"')
            and   name  = 'SJEDISTE_POSLOVNOG_SISTEMA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Poslovni sistem".SJEDISTE_POSLOVNOG_SISTEMA_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Poslovni sistem"')
            and   name  = 'PRAVNI_SLJEDBENIK_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Poslovni sistem".PRAVNI_SLJEDBENIK_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Poslovni sistem"')
            and   name  = 'DRZAVA_POSLOVNOG_SISTEMA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Poslovni sistem".DRZAVA_POSLOVNOG_SISTEMA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Poslovni sistem"')
            and   type = 'U')
   drop table "Poslovni sistem"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Potrebna školska sprema"')
            and   name  = 'POTREBNA_SKOLSKA_SPREMA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Potrebna školska sprema".POTREBNA_SKOLSKA_SPREMA_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Potrebna školska sprema"')
            and   name  = 'POTREBNA_SKOLSKA_SPREMA2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Potrebna školska sprema".POTREBNA_SKOLSKA_SPREMA2_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Potrebna školska sprema"')
            and   type = 'U')
   drop table "Potrebna školska sprema"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Potrebne spreme"')
            and   name  = 'POTREBNE_SPREME2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Potrebne spreme".POTREBNE_SPREME2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Potrebne spreme"')
            and   name  = 'POTREBNE_SPREME_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Potrebne spreme".POTREBNE_SPREME_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Potrebne spreme"')
            and   type = 'U')
   drop table "Potrebne spreme"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Povezana sa"')
            and   name  = 'POVEZANA_SA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Povezana sa".POVEZANA_SA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Povezana sa"')
            and   type = 'U')
   drop table "Povezana sa"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Pravni nasljednik"')
            and   name  = 'PRAVNI_NASLJEDNIK2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Pravni nasljednik".PRAVNI_NASLJEDNIK2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Pravni nasljednik"')
            and   name  = 'PRAVNI_NASLJEDNIK_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Pravni nasljednik".PRAVNI_NASLJEDNIK_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Pravni nasljednik"')
            and   type = 'U')
   drop table "Pravni nasljednik"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Pravno lice"')
            and   type = 'U')
   drop table "Pravno lice"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Pravo na podsistem"')
            and   name  = 'PRAVO_NA_PODSISTEM2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Pravo na podsistem".PRAVO_NA_PODSISTEM2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Pravo na podsistem"')
            and   name  = 'PRAVO_NA_PODSISTEM_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Pravo na podsistem".PRAVO_NA_PODSISTEM_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Pravo na podsistem"')
            and   type = 'U')
   drop table "Pravo na podsistem"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Predefinisane role radnih mjesta"')
            and   name  = 'PREDEFINISANE_ROLE_RADNIH_MJESTA2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Predefinisane role radnih mjesta".PREDEFINISANE_ROLE_RADNIH_MJESTA2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Predefinisane role radnih mjesta"')
            and   name  = 'PREDEFINISANE_ROLE_RADNIH_MJESTA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Predefinisane role radnih mjesta".PREDEFINISANE_ROLE_RADNIH_MJESTA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Predefinisane role radnih mjesta"')
            and   type = 'U')
   drop table "Predefinisane role radnih mjesta"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Pripada roli"')
            and   name  = 'SVRSTAN_U_GRUPU_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Pripada roli".SVRSTAN_U_GRUPU_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Pripada roli"')
            and   name  = 'KO_JE_U_GRUPI_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Pripada roli".KO_JE_U_GRUPI_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Pripada roli"')
            and   type = 'U')
   drop table "Pripada roli"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Radna mjesta u Organizacionoj jedinici"')
            and   name  = 'RADNO_MJESTO_U_KATALOGU_ORGANIZACIONEJ_JEDINICE_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Radna mjesta u Organizacionoj jedinici".RADNO_MJESTO_U_KATALOGU_ORGANIZACIONEJ_JEDINICE_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Radna mjesta u Organizacionoj jedinici"')
            and   name  = 'ORGANIZACIONA_JEDINICA_SADRZI_KATALOG_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Radna mjesta u Organizacionoj jedinici".ORGANIZACIONA_JEDINICA_SADRZI_KATALOG_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Radna mjesta u Organizacionoj jedinici"')
            and   type = 'U')
   drop table "Radna mjesta u Organizacionoj jedinici"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Raspored na radna mjesta"')
            and   name  = 'TIPIZACIJA_RADNOG_ODNOSA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Raspored na radna mjesta".TIPIZACIJA_RADNOG_ODNOSA_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Raspored na radna mjesta"')
            and   name  = 'RASPORED_ZAPOSLENOG_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Raspored na radna mjesta".RASPORED_ZAPOSLENOG_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Raspored na radna mjesta"')
            and   name  = 'RASPORED_ZAPOSLENIH_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Raspored na radna mjesta".RASPORED_ZAPOSLENIH_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Raspored na radna mjesta"')
            and   name  = 'KADROVI_U_ORGANIZACIONOJ_JEDINICI_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Raspored na radna mjesta".KADROVI_U_ORGANIZACIONOJ_JEDINICI_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Raspored na radna mjesta"')
            and   type = 'U')
   drop table "Raspored na radna mjesta"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Region')
            and   name  = 'ADMINISTRATIVNO_SJEDISTE_FK'
            and   indid > 0
            and   indid < 255)
   drop index Region.ADMINISTRATIVNO_SJEDISTE_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Region')
            and   name  = 'MATICNA_DRZAVA_FK'
            and   indid > 0
            and   indid < 255)
   drop index Region.MATICNA_DRZAVA_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Region')
            and   name  = 'TIPIZACIJA_REGIONA_FK'
            and   indid > 0
            and   indid < 255)
   drop index Region.TIPIZACIJA_REGIONA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Region')
            and   type = 'U')
   drop table Region
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Registar zaposlenih"')
            and   name  = 'ZAPOSLJAVA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Registar zaposlenih".ZAPOSLJAVA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Registar zaposlenih"')
            and   type = 'U')
   drop table "Registar zaposlenih"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Restrikcija atributa"')
            and   name  = 'RESTRIKCIJA_ATRIBUTA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Restrikcija atributa".RESTRIKCIJA_ATRIBUTA_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Restrikcija atributa"')
            and   name  = 'RESTRIKCIJA_ATRIBUTA2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Restrikcija atributa".RESTRIKCIJA_ATRIBUTA2_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Restrikcija atributa"')
            and   type = 'U')
   drop table "Restrikcija atributa"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Restrikcija nad tabelama"')
            and   name  = 'RESTRIKCIJA_NAD_TABELAMA2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Restrikcija nad tabelama".RESTRIKCIJA_NAD_TABELAMA2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Restrikcija nad tabelama"')
            and   name  = 'RESTRIKCIJA_NAD_TABELAMA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Restrikcija nad tabelama".RESTRIKCIJA_NAD_TABELAMA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Restrikcija nad tabelama"')
            and   type = 'U')
   drop table "Restrikcija nad tabelama"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Rola')
            and   name  = 'ROLE_POSLOVNOG_SISTEMA_FK'
            and   indid > 0
            and   indid < 255)
   drop index Rola.ROLE_POSLOVNOG_SISTEMA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Rola')
            and   type = 'U')
   drop table Rola
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sadri atribute"')
            and   name  = 'SADRZI_ATRIBUTE2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sadri atribute".SADRZI_ATRIBUTE2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sadri atribute"')
            and   name  = 'SADRZI_ATRIBUTE_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sadri atribute".SADRZI_ATRIBUTE_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Sadri atribute"')
            and   type = 'U')
   drop table "Sadri atribute"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sadri podsisteme"')
            and   name  = 'SADRZI_PODSISTEME2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sadri podsisteme".SADRZI_PODSISTEME2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sadri podsisteme"')
            and   name  = 'SADRZI_PODSISTEME_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sadri podsisteme".SADRZI_PODSISTEME_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Sadri podsisteme"')
            and   type = 'U')
   drop table "Sadri podsisteme"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sadri tabele"')
            and   name  = 'SADRZI_TABELE_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sadri tabele".SADRZI_TABELE_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sadri tabele"')
            and   name  = 'SADRZI_TABELE2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sadri tabele".SADRZI_TABELE2_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Sadri tabele"')
            and   type = 'U')
   drop table "Sadri tabele"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sastav drava"')
            and   name  = 'DRZAVA_CLANICA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sastav drava".DRZAVA_CLANICA_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sastav drava"')
            and   name  = 'SLOZENA_DRZAVA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sastav drava".SLOZENA_DRZAVA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Sastav drava"')
            and   type = 'U')
   drop table "Sastav drava"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sastav regiona"')
            and   name  = 'SASTAV_REGIONA2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sastav regiona".SASTAV_REGIONA2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sastav regiona"')
            and   name  = 'SASTAV_REGIONA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sastav regiona".SASTAV_REGIONA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Sastav regiona"')
            and   type = 'U')
   drop table "Sastav regiona"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sistem ili podsistem"')
            and   name  = 'RESURSI_POSLOVNOG_SISTEMA3_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sistem ili podsistem".RESURSI_POSLOVNOG_SISTEMA3_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Sistem ili podsistem"')
            and   type = 'U')
   drop table "Sistem ili podsistem"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Sistematizacija')
            and   name  = 'SISTEMATIZACIJA_POSLOVNOG_SISTEMA_FK'
            and   indid > 0
            and   indid < 255)
   drop index Sistematizacija.SISTEMATIZACIJA_POSLOVNOG_SISTEMA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Sistematizacija')
            and   type = 'U')
   drop table Sistematizacija
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sloena organizaciona jedinica"')
            and   name  = 'SLOZENA_ORGANIZACIONA_JEDINICA2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sloena organizaciona jedinica".SLOZENA_ORGANIZACIONA_JEDINICA2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sloena organizaciona jedinica"')
            and   name  = 'SLOZENA_ORGANIZACIONA_JEDINICA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sloena organizaciona jedinica".SLOZENA_ORGANIZACIONA_JEDINICA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Sloena organizaciona jedinica"')
            and   type = 'U')
   drop table "Sloena organizaciona jedinica"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sloeni poslovni sistem"')
            and   name  = 'TIPIZACIJA_SLOZENOG_POSLOVNOG_SISTEMA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sloeni poslovni sistem".TIPIZACIJA_SLOZENOG_POSLOVNOG_SISTEMA_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sloeni poslovni sistem"')
            and   name  = 'SISTEM_U_SASTAVU_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sloeni poslovni sistem".SISTEM_U_SASTAVU_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sloeni poslovni sistem"')
            and   name  = 'MATICNI_POSLOVNI_SISTEM_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sloeni poslovni sistem".MATICNI_POSLOVNI_SISTEM_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Sloeni poslovni sistem"')
            and   type = 'U')
   drop table "Sloeni poslovni sistem"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Status deklaracije"')
            and   type = 'U')
   drop table "Status deklaracije"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Status posiljke"')
            and   type = 'U')
   drop table "Status posiljke"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Status reklamacije"')
            and   type = 'U')
   drop table "Status reklamacije"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Struktura atributa"')
            and   name  = 'STRUKTURA_ATRIBUTA2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Struktura atributa".STRUKTURA_ATRIBUTA2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Struktura atributa"')
            and   name  = 'STRUKTURA_ATRIBUTA_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Struktura atributa".STRUKTURA_ATRIBUTA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Struktura atributa"')
            and   type = 'U')
   drop table "Struktura atributa"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Tabela')
            and   name  = 'RESURSI_POSLOVNOG_SISTEMA_FK'
            and   indid > 0
            and   indid < 255)
   drop index Tabela.RESURSI_POSLOVNOG_SISTEMA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Tabela')
            and   type = 'U')
   drop table Tabela
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Tip deklaracije"')
            and   type = 'U')
   drop table "Tip deklaracije"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Tip klijenta"')
            and   type = 'U')
   drop table "Tip klijenta"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Tip organizacione jedinice"')
            and   type = 'U')
   drop table "Tip organizacione jedinice"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Tip posiljke"')
            and   type = 'U')
   drop table "Tip posiljke"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Tip poslovnog sistema"')
            and   type = 'U')
   drop table "Tip poslovnog sistema"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Tip regiona"')
            and   type = 'U')
   drop table "Tip regiona"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Tip reklamacije"')
            and   type = 'U')
   drop table "Tip reklamacije"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Tip sloenog poslovnog sistema"')
            and   type = 'U')
   drop table "Tip sloenog poslovnog sistema"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Tip transporta"')
            and   type = 'U')
   drop table "Tip transporta"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Tip vozila"')
            and   type = 'U')
   drop table "Tip vozila"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Ugovor o transportu"')
            and   name  = 'PRIMALAC2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Ugovor o transportu".PRIMALAC2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Ugovor o transportu"')
            and   name  = 'POSILJALAC2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Ugovor o transportu".POSILJALAC2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Ugovor o transportu"')
            and   name  = 'ODGOVORNO_PRAVNO_LICE_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Ugovor o transportu".ODGOVORNO_PRAVNO_LICE_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Ugovor o transportu"')
            and   type = 'U')
   drop table "Ugovor o transportu"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Vozilo')
            and   name  = 'TIP_TRANSPORTA_VOZILA_FK'
            and   indid > 0
            and   indid < 255)
   drop index Vozilo.TIP_TRANSPORTA_VOZILA_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Vozilo')
            and   name  = 'TIP_VOZILA_FK'
            and   indid > 0
            and   indid < 255)
   drop index Vozilo.TIP_VOZILA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Vozilo')
            and   type = 'U')
   drop table Vozilo
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Vrsta radnog odnosa"')
            and   type = 'U')
   drop table "Vrsta radnog odnosa"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Zaduzenje vozila"')
            and   name  = 'ZADUZUJE_VOZILO_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Zaduzenje vozila".ZADUZUJE_VOZILO_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Zaduzenje vozila"')
            and   name  = 'VOZILO_ZADUZENO_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Zaduzenje vozila".VOZILO_ZADUZENO_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Zaduzenje vozila"')
            and   type = 'U')
   drop table "Zaduzenje vozila"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Školska sprema"')
            and   name  = 'KOJE_SKOLSKE_SPREME_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Školska sprema".KOJE_SKOLSKE_SPREME_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Školska sprema"')
            and   type = 'U')
   drop table "Školska sprema"
go

/*==============================================================*/
/* Table: "Adresni podaci"                                      */
/*==============================================================*/
create table "Adresni podaci" (
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Redni_Broj_Evidencije_Zaposlenih int                  not null,
   Tip                  char(1)              not null default 'P'
      constraint CKC_TIP_ADRESNI check (Tip in ('P','L')),
   "Redni broj"         smallint             not null,
   Oznaka               char(3)              not null,
   Naseljeno_mjesto_Identifikator int                  not null,
   Pos_Dr_Oznaka       char(3)              null,
   Pos_Poslovni_sistem_Identifikator bigint               null,
   Ulica                varchar(120)         null,
   Broj                 varchar(8)           null,
   "Fiksni telefon"     varchar(20)          null,
   "Mobilni telefon"    varchar(20)          null,
   email                varchar(60)          null,
   www                  varchar(120)         null,
   constraint "PK_ADRESNI PODACI" primary key (Dr_Oznaka, Poslovni_sistem_Identifikator, Redni_Broj_Evidencije_Zaposlenih, "Redni broj", Tip)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Adresni podaci"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Adresni podaci', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Adresni podaci', 'column', 'Dr_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Adresni podaci"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Adresni podaci', 'column', 'Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Adresni podaci', 'column', 'Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Adresni podaci"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Pos_Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Adresni podaci', 'column', 'Pos_Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Adresni podaci', 'column', 'Pos_Dr_Oznaka'
go

/*==============================================================*/
/* Index: KOD_DRUGOG_PRAVNOG_LICA_FK                            */
/*==============================================================*/
create index KOD_DRUGOG_PRAVNOG_LICA_FK on "Adresni podaci" (
Pos_Dr_Oznaka ASC,
Pos_Poslovni_sistem_Identifikator ASC
)
go

/*==============================================================*/
/* Index: KONTAKT_PODACI_FK                                     */
/*==============================================================*/
create index KONTAKT_PODACI_FK on "Adresni podaci" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
Redni_Broj_Evidencije_Zaposlenih ASC
)
go

/*==============================================================*/
/* Index: MJESTO_ADRESE_FK                                      */
/*==============================================================*/
create index MJESTO_ADRESE_FK on "Adresni podaci" (
Oznaka ASC,
Naseljeno_mjesto_Identifikator ASC
)
go

/*==============================================================*/
/* Table: Adresnica                                             */
/*==============================================================*/
create table Adresnica (
   Adresnica_Identifikator varchar(10)          not null,
   Nacin_Preuzimanja_Oznaka varchar(10)          not null,
   Nacin_Placanja_Oznaka varchar(10)          not null,
   "Klije.nt_Identofokator" varchar(10)          not null,
   "Kli_Klije.nt_Identofokator" varchar(10)          not null,
   Posiljka_Identifikator varchar(20)          null,
   Naziv_Posiljke       varchar(100)         not null,
   Broj_Telefona_Posiljaoca varchar(15)          not null,
   Bro_Telefona_Primaoca varchar(15)          not null,
   Adresa_Posiljaoca    varchar(100)         not null,
   Adresa_Primaoca      varchar(100)         not null,
   Vrijednost_Posiljke  decimal(6,2)         not null,
   Napomene             text                 null,
   constraint PK_ADRESNICA primary key (Adresnica_Identifikator)
)
go

/*==============================================================*/
/* Index: NACIN_PLACANJA_FK                                     */
/*==============================================================*/
create index NACIN_PLACANJA_FK on Adresnica (
Nacin_Placanja_Oznaka ASC
)
go

/*==============================================================*/
/* Index: NACIN_PREUZIMANJA_FK                                  */
/*==============================================================*/
create index NACIN_PREUZIMANJA_FK on Adresnica (
Nacin_Preuzimanja_Oznaka ASC
)
go

/*==============================================================*/
/* Index: OBRAZAC_ADRESNICE_FK                                  */
/*==============================================================*/
create index OBRAZAC_ADRESNICE_FK on Adresnica (
Posiljka_Identifikator ASC
)
go

/*==============================================================*/
/* Index: POSILJALAC_FK                                         */
/*==============================================================*/
create index POSILJALAC_FK on Adresnica (
"Kli_Klije.nt_Identofokator" ASC
)
go

/*==============================================================*/
/* Index: PRIMALAC_FK                                           */
/*==============================================================*/
create index PRIMALAC_FK on Adresnica (
"Klije.nt_Identofokator" ASC
)
go

/*==============================================================*/
/* Table: "Aktivne posiljke"                                    */
/*==============================================================*/
create table "Aktivne posiljke" (
   Organizaciona_Jedinica_Identifikator numeric(4)           not null,
   Posiljka_Identifikator varchar(20)          not null,
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   constraint "PK_AKTIVNE POSILJKE" primary key (Posiljka_Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Aktivne posiljke"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Aktivne posiljke', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Aktivne posiljke', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: JEDINICA_SADRZI_POSILLJKU_FK                          */
/*==============================================================*/
create index JEDINICA_SADRZI_POSILLJKU_FK on "Aktivne posiljke" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
Organizaciona_Jedinica_Identifikator ASC
)
go

/*==============================================================*/
/* Table: Atribut                                               */
/*==============================================================*/
create table Atribut (
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Identifikator        bigint               not null,
   Naziv                varchar(120)         not null,
   Kod                  varchar(30)          not null,
   constraint PK_ATRIBUT primary key (Dr_Oznaka, Poslovni_sistem_Identifikator, Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('Atribut')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Atribut', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Atribut', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: RESURSI_POSLOVNOG_SISTEMA2_FK                         */
/*==============================================================*/
create index RESURSI_POSLOVNOG_SISTEMA2_FK on Atribut (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC
)
go

/*==============================================================*/
/* Table: "Carinska deklaracija"                                */
/*==============================================================*/
create table "Carinska deklaracija" (
   Datum_Izdavanja      datetime             not null,
   Organizaciona_Jedinica_Identifikator numeric(4)           null,
   Status_deklaracije_Oznaka varchar(10)          not null,
   Status_Deklaracije_Identifikator varchar(10)          not null,
   Posiljka_Identifikator varchar(20)          null,
   Carinska_Deklaracija_Identifikator varchar(10)          not null,
   Drzava_Jedinica_Oznaka char(3)              null,
   Poslovni_sistem_Identifikator bigint               null,
   Carinska_Dokumentacija_Identifikator varchar(20)          null,
   constraint "PK_CARINSKA DEKLARACIJA" primary key (Carinska_Deklaracija_Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Carinska deklaracija"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava_Jedinica_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Carinska deklaracija', 'column', 'Drzava_Jedinica_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Carinska deklaracija', 'column', 'Drzava_Jedinica_Oznaka'
go

/*==============================================================*/
/* Index: DEKLARACIJA_POSILJKE_FK                               */
/*==============================================================*/
create index DEKLARACIJA_POSILJKE_FK on "Carinska deklaracija" (
Carinska_Dokumentacija_Identifikator ASC
)
go

/*==============================================================*/
/* Index: NALOGODAVAC_FK                                        */
/*==============================================================*/
create index NALOGODAVAC_FK on "Carinska deklaracija" (
Drzava_Jedinica_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
Organizaciona_Jedinica_Identifikator ASC
)
go

/*==============================================================*/
/* Index: PREDMET_DEKLARACIJE_FK                                */
/*==============================================================*/
create index PREDMET_DEKLARACIJE_FK on "Carinska deklaracija" (
Posiljka_Identifikator ASC
)
go

/*==============================================================*/
/* Index: STATUS_DEKLARACIJE_FK                                 */
/*==============================================================*/
create index STATUS_DEKLARACIJE_FK on "Carinska deklaracija" (
Status_Deklaracije_Identifikator ASC
)
go

/*==============================================================*/
/* Index: TIP_DEKLARACIJE_FK                                    */
/*==============================================================*/
create index TIP_DEKLARACIJE_FK on "Carinska deklaracija" (
Status_deklaracije_Oznaka ASC
)
go

/*==============================================================*/
/* Table: "Carinska dokumentacija"                              */
/*==============================================================*/
create table "Carinska dokumentacija" (
   Vozilo_Identifikator int                  null,
   Mjesto_Dostave_Oznaka char(3)              null,
   Redni_Broj_Evidencije_Zaposlenih int                  null,
   Carinska_Dokumentacija_Identifikator varchar(20)          not null,
   Drzava_Vozac_Oznaka  char(3)              null,
   Poslovni_sistem_Identifikator bigint               null,
   Naseljeno_mjesto_Identifikator int                  null,
   Datum_Izdavanja      datetime             not null,
   Tip_Vozila_Oznaka    varchar(10)          null,
   Granicni_Prelaz      varchar(200)         null,
   constraint "PK_CARINSKA DOKUMENTACIJA" primary key (Carinska_Dokumentacija_Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Carinska dokumentacija"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Mjesto_Dostave_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Carinska dokumentacija', 'column', 'Mjesto_Dostave_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Carinska dokumentacija', 'column', 'Mjesto_Dostave_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Carinska dokumentacija"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava_Vozac_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Carinska dokumentacija', 'column', 'Drzava_Vozac_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Carinska dokumentacija', 'column', 'Drzava_Vozac_Oznaka'
go

/*==============================================================*/
/* Index: MJESTO_DOSTAVE2_FK                                    */
/*==============================================================*/
create index MJESTO_DOSTAVE2_FK on "Carinska dokumentacija" (
Mjesto_Dostave_Oznaka ASC,
Naseljeno_mjesto_Identifikator ASC
)
go

/*==============================================================*/
/* Index: VOZAC_FK                                              */
/*==============================================================*/
create index VOZAC_FK on "Carinska dokumentacija" (
Drzava_Vozac_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
Redni_Broj_Evidencije_Zaposlenih ASC
)
go

/*==============================================================*/
/* Index: VOZILO_FK                                             */
/*==============================================================*/
create index VOZILO_FK on "Carinska dokumentacija" (
Tip_Vozila_Oznaka ASC,
Vozilo_Identifikator ASC
)
go

/*==============================================================*/
/* Table: Drzava                                                */
/*==============================================================*/
create table Drzava (
   Oznaka               char(3)              not null,
   Nas_Oznaka           char(3)              null,
   Naseljeno_mjesto_Identifikator int                  null,
   Onaka                char(1)              null,
   Naziv                varchar(120)         not null,
   "Datum osnivanja"    datetime             not null,
   "Pozivni broj"       numeric(5)           null,
   Grb                  image                null,
   Zastava              image                null,
   Himna                VARBINARY                 null,
   constraint PK_DRZAVA primary key (Oznaka)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('Drzava')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Drzava', 'column', 'Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Drzava', 'column', 'Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('Drzava')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Nas_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Drzava', 'column', 'Nas_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Drzava', 'column', 'Nas_Oznaka'
go

/*==============================================================*/
/* Index: AKTUELNI_GLAVNI_GRAD_FK                               */
/*==============================================================*/
create index AKTUELNI_GLAVNI_GRAD_FK on Drzava (
Nas_Oznaka ASC,
Naseljeno_mjesto_Identifikator ASC
)
go

/*==============================================================*/
/* Index: TEKUCE_URE_ENJE_FK                                    */
/*==============================================================*/
create index TEKUCE_URE_ENJE_FK on Drzava (
Onaka ASC
)
go

/*==============================================================*/
/* Table: Dravljanstvo                                         */
/*==============================================================*/
create table Dravljanstvo (
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Redni_Broj_Evidencije_Zaposlenih int                  not null,
   Oznaka               char(3)              not null,
   constraint PK_DRAVLJANSTVO primary key (Dr_Oznaka, Poslovni_sistem_Identifikator, Redni_Broj_Evidencije_Zaposlenih, Oznaka)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('Dravljanstvo')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Dravljanstvo', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Dravljanstvo', 'column', 'Dr_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('Dravljanstvo')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Dravljanstvo', 'column', 'Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Dravljanstvo', 'column', 'Oznaka'
go

/*==============================================================*/
/* Index: DRZAVLJANSTVO2_FK                                     */
/*==============================================================*/
create index DRZAVLJANSTVO2_FK on Dravljanstvo (
Oznaka ASC
)
go

/*==============================================================*/
/* Index: DRZAVLJANSTVO_FK                                      */
/*==============================================================*/
create index DRZAVLJANSTVO_FK on Dravljanstvo (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
Redni_Broj_Evidencije_Zaposlenih ASC
)
go

/*==============================================================*/
/* Table: "Dravno uredenje"                                    */
/*==============================================================*/
create table "Dravno uredenje" (
   Onaka                char(1)              not null,
   Naziv                varchar(120)         not null,
   Opis                 varchar(256)         null,
   constraint "PK_DRAVNO UREĞENJE" primary key (Onaka)
)
go

/*==============================================================*/
/* Table: "Evidencija posiljki"                                 */
/*==============================================================*/
create table "Evidencija posiljki" (
   Organizaciona_Jedinica_Identifikator numeric(4)           not null,
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Posiljka_Identifikator varchar(20)          not null,
   Evidencija_Posiljki_Identifikator int                  not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   constraint "PK_EVIDENCIJA POSILJKI" primary key (Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator, Posiljka_Identifikator, Evidencija_Posiljki_Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Evidencija posiljki"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Evidencija posiljki', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Evidencija posiljki', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: EVIDENCIJA_POSILJKA_U_JEDINICI_FK                     */
/*==============================================================*/
create index EVIDENCIJA_POSILJKA_U_JEDINICI_FK on "Evidencija posiljki" (
Posiljka_Identifikator ASC
)
go

/*==============================================================*/
/* Index: SADRZI_POSILJKU_FK                                    */
/*==============================================================*/
create index SADRZI_POSILJKU_FK on "Evidencija posiljki" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
Organizaciona_Jedinica_Identifikator ASC
)
go

/*==============================================================*/
/* Table: "Evidencija reklamacija"                              */
/*==============================================================*/
create table "Evidencija reklamacija" (
   Tip_Reklamacije_Oznaka varchar(10)          not null,
   Status_Reklamacije_Oznaka varchar(10)          null,
   Organizaciona_Jedinica_Identifikator numeric(4)           not null,
   Posiljka_Identifikator varchar(20)          not null,
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Datum_Reklamacije    datetime             not null,
   Opis_Problema        text                 null,
   constraint "PK_EVIDENCIJA REKLAMACIJA" primary key (Tip_Reklamacije_Oznaka, Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator, Posiljka_Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Evidencija reklamacija"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Evidencija reklamacija', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Evidencija reklamacija', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: ISTORIJA_STATUSA_REKLAMACIJE_FK                       */
/*==============================================================*/
create index ISTORIJA_STATUSA_REKLAMACIJE_FK on "Evidencija reklamacija" (
Status_Reklamacije_Oznaka ASC
)
go

/*==============================================================*/
/* Index: PREDMET_REKLAMACIJE_FK                                */
/*==============================================================*/
create index PREDMET_REKLAMACIJE_FK on "Evidencija reklamacija" (
Posiljka_Identifikator ASC
)
go

/*==============================================================*/
/* Index: REKLAMACIJA_FK                                        */
/*==============================================================*/
create index REKLAMACIJA_FK on "Evidencija reklamacija" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
Organizaciona_Jedinica_Identifikator ASC
)
go

/*==============================================================*/
/* Index: SVRHA_REKLAMACIJE_FK                                  */
/*==============================================================*/
create index SVRHA_REKLAMACIJE_FK on "Evidencija reklamacija" (
Tip_Reklamacije_Oznaka ASC
)
go

/*==============================================================*/
/* Table: "Fizicko lice"                                        */
/*==============================================================*/
create table "Fizicko lice" (
   Fizicko_Lice_Identifikator varchar(15)          not null,
   Ime                  varchar(100)         not null,
   Prezime              varchar(100)         not null,
   Email                varchar(100)         not null,
   Telefon              varchar(10)          not null,
   constraint "PK_FIZICKO LICE" primary key (Fizicko_Lice_Identifikator)
)
go

/*==============================================================*/
/* Table: "Flota vozila"                                        */
/*==============================================================*/
create table "Flota vozila" (
   Organizaciona_Jedinica_Identifikator numeric(4)           null,
   Flota_vozila_Identifikator int                  not null,
   Drzava_Jedinice_Oznaka char(3)              null,
   Poslovni_sistem_Identifikator bigint               null,
   Tip_Vozila_Oznaka    varchar(10)          null,
   Vozilo_Identifikator int                  null,
   Od                   datetime             not null,
   Do                   date                 null,
   constraint "PK_FLOTA VOZILA" primary key (Flota_vozila_Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Flota vozila"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava_Jedinice_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Flota vozila', 'column', 'Drzava_Jedinice_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Flota vozila', 'column', 'Drzava_Jedinice_Oznaka'
go

/*==============================================================*/
/* Index: FLOTA_VOZILA_ORGANIZACIONE_JEDINICE_FK                */
/*==============================================================*/
create index FLOTA_VOZILA_ORGANIZACIONE_JEDINICE_FK on "Flota vozila" (
Drzava_Jedinice_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
Organizaciona_Jedinica_Identifikator ASC
)
go

/*==============================================================*/
/* Index: VOZILO_U_FLOTI_FK                                     */
/*==============================================================*/
create index VOZILO_U_FLOTI_FK on "Flota vozila" (
Tip_Vozila_Oznaka ASC,
Vozilo_Identifikator ASC
)
go

/*==============================================================*/
/* Table: "Glavni grad"                                         */
/*==============================================================*/
create table "Glavni grad" (
   Dr_Oznaka           char(3)              not null,
   Oznaka               char(3)              not null,
   Naseljeno_mjesto_Identifikator int                  not null,
   "Redni broj"         numeric(1,0)         not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   constraint "PK_GLAVNI GRAD" primary key (Dr_Oznaka, Oznaka, Naseljeno_mjesto_Identifikator, "Redni broj")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Glavni grad"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Glavni grad', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Glavni grad', 'column', 'Dr_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Glavni grad"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Glavni grad', 'column', 'Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Glavni grad', 'column', 'Oznaka'
go

/*==============================================================*/
/* Index: GLAVNI_GRAD_FK                                        */
/*==============================================================*/
create index GLAVNI_GRAD_FK on "Glavni grad" (
Dr_Oznaka ASC
)
go

/*==============================================================*/
/* Index: GLAVNI_GRAD_U_DRZAVI_FK                               */
/*==============================================================*/
create index GLAVNI_GRAD_U_DRZAVI_FK on "Glavni grad" (
Oznaka ASC,
Naseljeno_mjesto_Identifikator ASC
)
go

/*==============================================================*/
/* Table: "Istorija adresnice"                                  */
/*==============================================================*/
create table "Istorija adresnice" (
   Posiljka_Identifikator varchar(20)          not null,
   Adresnica_Identifikator varchar(10)          not null,
   Drzava_Zaposlenog_Oznaka char(3)              not null,
   Poslovni_Sistem_Identifikator bigint               not null,
   Redni_Broj_Evidencije_Zaposlenih int                  not null,
   Istorija_Adresnice_Identifikator int                  not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   constraint "PK_ISTORIJA ADRESNICE" primary key (Drzava_Zaposlenog_Oznaka, Poslovni_Sistem_Identifikator, Redni_Broj_Evidencije_Zaposlenih, Adresnica_Identifikator, Posiljka_Identifikator, Istorija_Adresnice_Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Istorija adresnice"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava_Zaposlenog_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Istorija adresnice', 'column', 'Drzava_Zaposlenog_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Istorija adresnice', 'column', 'Drzava_Zaposlenog_Oznaka'
go

/*==============================================================*/
/* Index: OBRAZAC_ADRESNICE2_FK                                 */
/*==============================================================*/
create index OBRAZAC_ADRESNICE2_FK on "Istorija adresnice" (
Adresnica_Identifikator ASC
)
go

/*==============================================================*/
/* Index: POSILJKA_FK                                           */
/*==============================================================*/
create index POSILJKA_FK on "Istorija adresnice" (
Posiljka_Identifikator ASC
)
go

/*==============================================================*/
/* Index: PROMJENA_ADRESNICE_OD_STRANE_ZAPOSLENOG_FK            */
/*==============================================================*/
create index PROMJENA_ADRESNICE_OD_STRANE_ZAPOSLENOG_FK on "Istorija adresnice" (
Drzava_Zaposlenog_Oznaka ASC,
Poslovni_Sistem_Identifikator ASC,
Redni_Broj_Evidencije_Zaposlenih ASC
)
go

/*==============================================================*/
/* Table: "Istorija akcija"                                     */
/*==============================================================*/
create table "Istorija akcija" (
   Pos_Dr_Oznaka       char(3)              not null,
   Pos_Poslovni_sistem_Identifikator bigint               not null,
   "User ID"            varchar(30)          not null,
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Organizaciona_Jedinica_Identifikator numeric(4)           not null,
   Istorija_akcije_Identifikator int                  not null,
   Tab_Dr_Oznaka       char(3)              null,
   Tab_Poslovni_sistem_Identifikator bigint               null,
   Identifikator        bigint               null,
   Vrijeme_izmjene      datetime             not null,
   constraint "PK_ISTORIJA AKCIJA" primary key (Pos_Dr_Oznaka, Pos_Poslovni_sistem_Identifikator, "User ID", Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator, Istorija_akcije_Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Istorija akcija"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Pos_Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Istorija akcija', 'column', 'Pos_Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Istorija akcija', 'column', 'Pos_Dr_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Istorija akcija"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Istorija akcija', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Istorija akcija', 'column', 'Dr_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Istorija akcija"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Tab_Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Istorija akcija', 'column', 'Tab_Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Istorija akcija', 'column', 'Tab_Dr_Oznaka'
go

/*==============================================================*/
/* Index: AKCIJA_NAD_TABELOM_FK                                 */
/*==============================================================*/
create index AKCIJA_NAD_TABELOM_FK on "Istorija akcija" (
Tab_Dr_Oznaka ASC,
Tab_Poslovni_sistem_Identifikator ASC,
Identifikator ASC
)
go

/*==============================================================*/
/* Index: ISTORIJA_AKCIJA_KORISNIKA_FK                          */
/*==============================================================*/
create index ISTORIJA_AKCIJA_KORISNIKA_FK on "Istorija akcija" (
Pos_Dr_Oznaka ASC,
Pos_Poslovni_sistem_Identifikator ASC,
"User ID" ASC
)
go

/*==============================================================*/
/* Index: ISTORIJA_AKCIJA_U_JEDINICI_FK                         */
/*==============================================================*/
create index ISTORIJA_AKCIJA_U_JEDINICI_FK on "Istorija akcija" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
Organizaciona_Jedinica_Identifikator ASC
)
go

/*==============================================================*/
/* Table: "Istorija deklaracije"                                */
/*==============================================================*/
create table "Istorija deklaracije" (
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Redni_Broj_Evidencije_Zaposlenih int                  not null,
   Carinska_Deklaracija_Identifikator varchar(10)          not null,
   Status_Deklaracije_Identifikator varchar(10)          not null,
   Istorija_deklaracije_Identifikator int                  not null,
   Do                   datetime             not null,
   Od                   datetime             null,
   constraint "PK_ISTORIJA DEKLARACIJE" primary key (Dr_Oznaka, Poslovni_sistem_Identifikator, Redni_Broj_Evidencije_Zaposlenih, Carinska_Deklaracija_Identifikator, Status_Deklaracije_Identifikator, Istorija_deklaracije_Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Istorija deklaracije"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Istorija deklaracije', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Istorija deklaracije', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: CARINSKA_DEKLARACIJA_FK                               */
/*==============================================================*/
create index CARINSKA_DEKLARACIJA_FK on "Istorija deklaracije" (
Carinska_Deklaracija_Identifikator ASC
)
go

/*==============================================================*/
/* Index: ISTORIJA_STATUSA_DEKLARACIJE_FK                       */
/*==============================================================*/
create index ISTORIJA_STATUSA_DEKLARACIJE_FK on "Istorija deklaracije" (
Status_Deklaracije_Identifikator ASC
)
go

/*==============================================================*/
/* Index: PROMJENA_DEKLARACIJE_OD_STRANE_ZAPOSLENOG_FK          */
/*==============================================================*/
create index PROMJENA_DEKLARACIJE_OD_STRANE_ZAPOSLENOG_FK on "Istorija deklaracije" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
Redni_Broj_Evidencije_Zaposlenih ASC
)
go

/*==============================================================*/
/* Table: "Istorija izmjena"                                    */
/*==============================================================*/
create table "Istorija izmjena" (
   Pos_Dr_Oznaka       char(3)              not null,
   Pos_Poslovni_sistem_Identifikator bigint               not null,
   "User ID"            varchar(30)          not null,
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Organizaciona_Jedinica_Identifikator numeric(4)           not null,
   Istorija_Izmjene_Identifikator int                  not null,
   Tab_Dr_Oznaka       char(3)              null,
   Tab_Poslovni_sistem_Identifikator bigint               null,
   Identifikator        bigint               null,
   Virjeme_izmjene      datetime             not null,
   constraint "PK_ISTORIJA IZMJENA" primary key (Pos_Dr_Oznaka, Pos_Poslovni_sistem_Identifikator, "User ID", Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator, Istorija_Izmjene_Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Istorija izmjena"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Pos_Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Istorija izmjena', 'column', 'Pos_Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Istorija izmjena', 'column', 'Pos_Dr_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Istorija izmjena"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Istorija izmjena', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Istorija izmjena', 'column', 'Dr_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Istorija izmjena"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Tab_Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Istorija izmjena', 'column', 'Tab_Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Istorija izmjena', 'column', 'Tab_Dr_Oznaka'
go

/*==============================================================*/
/* Index: ISTORIJA_IZMJENA_KORISNIKA_FK                         */
/*==============================================================*/
create index ISTORIJA_IZMJENA_KORISNIKA_FK on "Istorija izmjena" (
Pos_Dr_Oznaka ASC,
Pos_Poslovni_sistem_Identifikator ASC,
"User ID" ASC
)
go

/*==============================================================*/
/* Index: IZMJENA_U_JEDINICI_FK                                 */
/*==============================================================*/
create index IZMJENA_U_JEDINICI_FK on "Istorija izmjena" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
Organizaciona_Jedinica_Identifikator ASC
)
go

/*==============================================================*/
/* Index: IZMJENE_NAD_TABELOM_FK                                */
/*==============================================================*/
create index IZMJENE_NAD_TABELOM_FK on "Istorija izmjena" (
Tab_Dr_Oznaka ASC,
Tab_Poslovni_sistem_Identifikator ASC,
Identifikator ASC
)
go

/*==============================================================*/
/* Table: "Istorija logova pristupa"                            */
/*==============================================================*/
create table "Istorija logova pristupa" (
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Organizaciona_Jedinica_Identifikator numeric(4)           not null,
   Pos_Dr_Oznaka       char(3)              not null,
   Pos_Poslovni_sistem_Identifikator bigint               not null,
   "User ID"            varchar(30)          not null,
   Istorija_pristupa_Identifikator int                  not null,
   Sis_Dr_Oznaka       char(3)              null,
   Sis_Poslovni_sistem_Identifikator bigint               null,
   Identifikator        bigint               null,
   Vrijeme_pristupa     datetime             not null,
   constraint "PK_ISTORIJA LOGOVA PRISTUPA" primary key (Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator, Pos_Dr_Oznaka, Pos_Poslovni_sistem_Identifikator, "User ID", Istorija_pristupa_Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Istorija logova pristupa"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Istorija logova pristupa', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Istorija logova pristupa', 'column', 'Dr_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Istorija logova pristupa"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Pos_Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Istorija logova pristupa', 'column', 'Pos_Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Istorija logova pristupa', 'column', 'Pos_Dr_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Istorija logova pristupa"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Sis_Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Istorija logova pristupa', 'column', 'Sis_Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Istorija logova pristupa', 'column', 'Sis_Dr_Oznaka'
go

/*==============================================================*/
/* Index: PRIJAVA_KORISNIKA_FK                                  */
/*==============================================================*/
create index PRIJAVA_KORISNIKA_FK on "Istorija logova pristupa" (
Pos_Dr_Oznaka ASC,
Pos_Poslovni_sistem_Identifikator ASC,
"User ID" ASC
)
go

/*==============================================================*/
/* Index: PRIJAVA_NA_SISTEM_FK                                  */
/*==============================================================*/
create index PRIJAVA_NA_SISTEM_FK on "Istorija logova pristupa" (
Sis_Dr_Oznaka ASC,
Sis_Poslovni_sistem_Identifikator ASC,
Identifikator ASC
)
go

/*==============================================================*/
/* Index: PRIJAVA_U_JEDINICI_FK                                 */
/*==============================================================*/
create index PRIJAVA_U_JEDINICI_FK on "Istorija logova pristupa" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
Organizaciona_Jedinica_Identifikator ASC
)
go

/*==============================================================*/
/* Table: "Istorija odrzavanja"                                 */
/*==============================================================*/
create table "Istorija odrzavanja" (
   Tip_Vozila_Oznaka    varchar(10)          not null,
   Vozilo_Identifikator int                  not null,
   Odrzavanje_Vozila_Identifikator int                  not null,
   Istorija_Odrzavanja_Identifikator int                  not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   constraint "PK_ISTORIJA ODRZAVANJA" primary key (Odrzavanje_Vozila_Identifikator, Tip_Vozila_Oznaka, Vozilo_Identifikator, Istorija_Odrzavanja_Identifikator)
)
go

/*==============================================================*/
/* Index: ISTORIJA_ODZAVANJA_VOZILA_FK                          */
/*==============================================================*/
create index ISTORIJA_ODZAVANJA_VOZILA_FK on "Istorija odrzavanja" (
Odrzavanje_Vozila_Identifikator ASC
)
go

/*==============================================================*/
/* Index: ODRZAVANO_VOZILO_FK                                   */
/*==============================================================*/
create index ODRZAVANO_VOZILO_FK on "Istorija odrzavanja" (
Tip_Vozila_Oznaka ASC,
Vozilo_Identifikator ASC
)
go

/*==============================================================*/
/* Table: "Istorija posiljke"                                   */
/*==============================================================*/
create table "Istorija posiljke" (
   Status_Posiljke_Oznaka varchar(10)          not null,
   Posiljka_Identifikator varchar(20)          not null,
   Redni_Broj_Evidencije_Zaposlenih int                  not null,
   Drzava_Zaposlenog_Oznaka char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Istorija_Posiljke_Identifikator int                  not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   constraint "PK_ISTORIJA POSILJKE" primary key (Posiljka_Identifikator, Drzava_Zaposlenog_Oznaka, Poslovni_sistem_Identifikator, Redni_Broj_Evidencije_Zaposlenih, Status_Posiljke_Oznaka, Istorija_Posiljke_Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Istorija posiljke"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava_Zaposlenog_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Istorija posiljke', 'column', 'Drzava_Zaposlenog_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Istorija posiljke', 'column', 'Drzava_Zaposlenog_Oznaka'
go

/*==============================================================*/
/* Index: ISTORIJA_STATUSA_FK                                   */
/*==============================================================*/
create index ISTORIJA_STATUSA_FK on "Istorija posiljke" (
Status_Posiljke_Oznaka ASC
)
go

/*==============================================================*/
/* Index: PARAMETRI_POSILJKE_FK                                 */
/*==============================================================*/
create index PARAMETRI_POSILJKE_FK on "Istorija posiljke" (
Posiljka_Identifikator ASC
)
go

/*==============================================================*/
/* Index: PROMJENA_POSILJKE_OD_STRANE_ZAPOSLENOG_FK             */
/*==============================================================*/
create index PROMJENA_POSILJKE_OD_STRANE_ZAPOSLENOG_FK on "Istorija posiljke" (
Drzava_Zaposlenog_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
Redni_Broj_Evidencije_Zaposlenih ASC
)
go

/*==============================================================*/
/* Table: "Istorija reklamacija"                                */
/*==============================================================*/
create table "Istorija reklamacija" (
   Organizaciona_Jedinica_Identifikator numeric(4)           not null,
   Status_Reklamacije_Oznaka varchar(10)          not null,
   Tip_Reklamacije_Oznaka varchar(10)          not null,
   Posiljka_Identifikator varchar(20)          not null,
   Drzava_Zaposlenog_Oznaka char(3)              not null,
   Poslovni_Sistem_Zaposlenog_Identifikator bigint               not null,
   Redni_Broj_Evidencije_Zaposlenih int                  not null,
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Istorija_Reklamacija_Identifikator int                  not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   constraint "PK_ISTORIJA REKLAMACIJA" primary key (Drzava_Zaposlenog_Oznaka, Poslovni_Sistem_Zaposlenog_Identifikator, Redni_Broj_Evidencije_Zaposlenih, Tip_Reklamacije_Oznaka, Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator, Posiljka_Identifikator, Status_Reklamacije_Oznaka, Istorija_Reklamacija_Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Istorija reklamacija"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava_Zaposlenog_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Istorija reklamacija', 'column', 'Drzava_Zaposlenog_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Istorija reklamacija', 'column', 'Drzava_Zaposlenog_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Istorija reklamacija"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Istorija reklamacija', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Istorija reklamacija', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: ISTORIJA_REKLAMACIJE_FK                               */
/*==============================================================*/
create index ISTORIJA_REKLAMACIJE_FK on "Istorija reklamacija" (
Tip_Reklamacije_Oznaka ASC,
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
Organizaciona_Jedinica_Identifikator ASC,
Posiljka_Identifikator ASC
)
go

/*==============================================================*/
/* Index: ISTORIJA_STATUSA_REKLAMACIJE2_FK                      */
/*==============================================================*/
create index ISTORIJA_STATUSA_REKLAMACIJE2_FK on "Istorija reklamacija" (
Status_Reklamacije_Oznaka ASC
)
go

/*==============================================================*/
/* Index: ZAPOSLENI_OTVORIO_REKLAMACIJU_FK                      */
/*==============================================================*/
create index ZAPOSLENI_OTVORIO_REKLAMACIJU_FK on "Istorija reklamacija" (
Drzava_Zaposlenog_Oznaka ASC,
Poslovni_Sistem_Zaposlenog_Identifikator ASC,
Redni_Broj_Evidencije_Zaposlenih ASC
)
go

/*==============================================================*/
/* Table: "Istorija transport posiljke"                         */
/*==============================================================*/
create table "Istorija transport posiljke" (
   Posiljka_Identifikator varchar(20)          not null,
   Tip_Vozila_Oznaka    varchar(10)          not null,
   Vozilo_Identifikator int                  not null,
   Istorija_Transporta_Posiljke_Identifikator int                  not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   constraint "PK_ISTORIJA TRANSPORT POSILJKE" primary key (Posiljka_Identifikator, Tip_Vozila_Oznaka, Vozilo_Identifikator, Istorija_Transporta_Posiljke_Identifikator)
)
go

/*==============================================================*/
/* Index: ISTORIJA_POSILJKE_U_VOZILU_FK                         */
/*==============================================================*/
create index ISTORIJA_POSILJKE_U_VOZILU_FK on "Istorija transport posiljke" (
Posiljka_Identifikator ASC
)
go

/*==============================================================*/
/* Index: ISTORIJA_VOZILA_KOJE_SADRZI_POSILJKU_FK               */
/*==============================================================*/
create index ISTORIJA_VOZILA_KOJE_SADRZI_POSILJKU_FK on "Istorija transport posiljke" (
Tip_Vozila_Oznaka ASC,
Vozilo_Identifikator ASC
)
go

/*==============================================================*/
/* Table: "Istorija uredenja"                                   */
/*==============================================================*/
create table "Istorija uredenja" (
   Oznaka               char(3)              not null,
   "Redni broj"         numeric(2,0)         not null,
   Onaka                char(1)              not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   constraint "PK_ISTORIJA UREĞENJA" primary key (Oznaka, "Redni broj")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Istorija uredenja"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Istorija uredenja', 'column', 'Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Istorija uredenja', 'column', 'Oznaka'
go

/*==============================================================*/
/* Index: KROZ_ISTORIJU_FK                                      */
/*==============================================================*/
create index KROZ_ISTORIJU_FK on "Istorija uredenja" (
Oznaka ASC
)
go

/*==============================================================*/
/* Index: URE_ENJE_DRZAVE_FK                                    */
/*==============================================================*/
create index URE_ENJE_DRZAVE_FK on "Istorija uredenja" (
Onaka ASC
)
go

/*==============================================================*/
/* Table: "Izabrani tipovi organizacione jedinice"              */
/*==============================================================*/
create table "Izabrani tipovi organizacione jedinice" (
   Oznaka               char(1)              not null,
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Aktivan              bit                  not null,
   constraint "PK_IZABRANI TIPOVI ORGANIZACIO" primary key (Oznaka, Dr_Oznaka, Poslovni_sistem_Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Izabrani tipovi organizacione jedinice"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Izabrani tipovi organizacione jedinice', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Izabrani tipovi organizacione jedinice', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: IZABRANA_TIPIZACIJA_ORGANIZACIONE_JEDINICE_FK         */
/*==============================================================*/
create index IZABRANA_TIPIZACIJA_ORGANIZACIONE_JEDINICE_FK on "Izabrani tipovi organizacione jedinice" (
Oznaka ASC
)
go

/*==============================================================*/
/* Index: IZBOR_TIPIZACIJE_PO_POSLOVNOM_SISTEMU_FK              */
/*==============================================================*/
create index IZBOR_TIPIZACIJE_PO_POSLOVNOM_SISTEMU_FK on "Izabrani tipovi organizacione jedinice" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC
)
go

/*==============================================================*/
/* Table: "Katalog radnih mjesta"                               */
/*==============================================================*/
create table "Katalog radnih mjesta" (
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Katalog_radnih_mjesta_Oznaka numeric(4,0)         not null,
   "Naziv radnog mjesta" varchar(120)         not null,
   "Planski broj izvršilaca" numeric(3,0)         not null,
   constraint "PK_KATALOG RADNIH MJESTA" primary key (Dr_Oznaka, Poslovni_sistem_Identifikator, Katalog_radnih_mjesta_Oznaka)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Katalog radnih mjesta"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Katalog radnih mjesta', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Katalog radnih mjesta', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: IMA_RADNA_MJESTA_FK                                   */
/*==============================================================*/
create index IMA_RADNA_MJESTA_FK on "Katalog radnih mjesta" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC
)
go

/*==============================================================*/
/* Table: "Katalog zanimanja"                                   */
/*==============================================================*/
create table "Katalog zanimanja" (
   Oznaka               char(3)              not null,
   Zanimanje            int                  not null,
   Naziv                varchar(120)         not null,
   constraint "PK_KATALOG ZANIMANJA" primary key (Oznaka, Zanimanje)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Katalog zanimanja"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Katalog zanimanja', 'column', 'Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Katalog zanimanja', 'column', 'Oznaka'
go

/*==============================================================*/
/* Index: REGISTROVANA_ZANIMANJA_FK                             */
/*==============================================================*/
create index REGISTROVANA_ZANIMANJA_FK on "Katalog zanimanja" (
Oznaka ASC
)
go

/*==============================================================*/
/* Table: "Katalog zvanja"                                      */
/*==============================================================*/
create table "Katalog zvanja" (
   Dr_Oznaka           char(3)              not null,
   Oznaka               char(2)              not null,
   Naziv                varchar(120)         not null,
   Opis                 varchar(256)         null,
   constraint "PK_KATALOG ZVANJA" primary key (Dr_Oznaka, Oznaka)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Katalog zvanja"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Katalog zvanja', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Katalog zvanja', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: KATALOG_ZVANJA_FK                                     */
/*==============================================================*/
create index KATALOG_ZVANJA_FK on "Katalog zvanja" (
Dr_Oznaka ASC
)
go

/*==============================================================*/
/* Table: Klijent                                               */
/*==============================================================*/
create table Klijent (
   Tip_Klijenta_Oznaka  int                  not null,
   "Klije.nt_Identofokator" varchar(10)          not null,
   Pravno_Lice_Identifikator varchar(10)          null,
   Fizicko_Lice_Identifikator varchar(15)          null,
   constraint PK_KLIJENT primary key ("Klije.nt_Identofokator")
)
go

/*==============================================================*/
/* Index: FIZICKO_LICE_FK                                       */
/*==============================================================*/
create index FIZICKO_LICE_FK on Klijent (
Fizicko_Lice_Identifikator ASC
)
go

/*==============================================================*/
/* Index: PRAVNO_LICE_FK                                        */
/*==============================================================*/
create index PRAVNO_LICE_FK on Klijent (
Pravno_Lice_Identifikator ASC
)
go

/*==============================================================*/
/* Index: TIP_KLIJENTA_FK                                       */
/*==============================================================*/
create index TIP_KLIJENTA_FK on Klijent (
Tip_Klijenta_Oznaka ASC
)
go

/*==============================================================*/
/* Table: "Korisnicki nalog"                                    */
/*==============================================================*/
create table "Korisnicki nalog" (
   Pos_Dr_Oznaka       char(3)              not null,
   Pos_Poslovni_sistem_Identifikator bigint               not null,
   "User ID"            varchar(30)          not null,
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Redni_Broj_Evidencije_Zaposlenih int                  not null,
   Username             varchar(15)          not null,
   Password             varchar(256)         null,
   "Datum registracije" datetime             not null,
   Aktivan              bit                  not null,
   constraint "PK_KORISNICKI NALOG" primary key (Pos_Dr_Oznaka, Pos_Poslovni_sistem_Identifikator, "User ID")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Korisnicki nalog"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Pos_Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Korisnicki nalog', 'column', 'Pos_Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Korisnicki nalog', 'column', 'Pos_Dr_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Korisnicki nalog"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Korisnicki nalog', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Korisnicki nalog', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: NALOG_ZAPOSLENOG_FK                                   */
/*==============================================================*/
create index NALOG_ZAPOSLENOG_FK on "Korisnicki nalog" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
Redni_Broj_Evidencije_Zaposlenih ASC
)
go

/*==============================================================*/
/* Index: REGISTROVANI_KORISNICI_FK                             */
/*==============================================================*/
create index REGISTROVANI_KORISNICI_FK on "Korisnicki nalog" (
Pos_Dr_Oznaka ASC,
Pos_Poslovni_sistem_Identifikator ASC
)
go

/*==============================================================*/
/* Table: "Lista zvanja"                                        */
/*==============================================================*/
create table "Lista zvanja" (
   Stepen               numeric(1)           not null,
   "Nivo obrazovanja"   smallint             not null,
   Ško_Oznaka           char(2)              not null,
   Dr_Oznaka           char(3)              not null,
   Oznaka               char(2)              not null,
   constraint "PK_LISTA ZVANJA" primary key (Stepen, "Nivo obrazovanja", Ško_Oznaka, Dr_Oznaka, Oznaka)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Lista zvanja"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Lista zvanja', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Lista zvanja', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: LISTA_ZVANJA2_FK                                      */
/*==============================================================*/
create index LISTA_ZVANJA2_FK on "Lista zvanja" (
Dr_Oznaka ASC,
Oznaka ASC
)
go

/*==============================================================*/
/* Index: LISTA_ZVANJA_FK                                       */
/*==============================================================*/
create index LISTA_ZVANJA_FK on "Lista zvanja" (
Stepen ASC,
"Nivo obrazovanja" ASC,
Ško_Oznaka ASC
)
go

/*==============================================================*/
/* Table: "Mjesna zajednica"                                    */
/*==============================================================*/
create table "Mjesna zajednica" (
   Oznaka               char(3)              not null,
   "Oznaka opštine"     numeric(3,0)         not null,
   Identifikator        numeric(2,0)         not null,
   Nas_Oznaka           char(3)              null,
   Naseljeno_mjesto_Identifikator int                  null,
   "Naziv mjesne zajednice" varchar(120)         not null,
   constraint "PK_MJESNA ZAJEDNICA" primary key (Oznaka, "Oznaka opštine", Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Mjesna zajednica"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Mjesna zajednica', 'column', 'Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Mjesna zajednica', 'column', 'Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Mjesna zajednica"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Nas_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Mjesna zajednica', 'column', 'Nas_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Mjesna zajednica', 'column', 'Nas_Oznaka'
go

/*==============================================================*/
/* Index: IMA_MJESNE_ZAJEDNICE_FK                               */
/*==============================================================*/
create index IMA_MJESNE_ZAJEDNICE_FK on "Mjesna zajednica" (
Oznaka ASC,
"Oznaka opštine" ASC
)
go

/*==============================================================*/
/* Index: SJEDISTE_MJESNE_ZAJEDNICE_FK                          */
/*==============================================================*/
create index SJEDISTE_MJESNE_ZAJEDNICE_FK on "Mjesna zajednica" (
Nas_Oznaka ASC,
Naseljeno_mjesto_Identifikator ASC
)
go

/*==============================================================*/
/* Table: "Mjesno pokrivanje naselja"                           */
/*==============================================================*/
create table "Mjesno pokrivanje naselja" (
   Mje_Oznaka           char(3)              not null,
   "Oznaka opštine"     numeric(3,0)         not null,
   Identifikator        numeric(2,0)         not null,
   Oznaka               char(3)              not null,
   Naseljeno_mjesto_Identifikator int                  not null,
   constraint "PK_MJESNO POKRIVANJE NASELJA" primary key (Mje_Oznaka, "Oznaka opštine", Identifikator, Oznaka, Naseljeno_mjesto_Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Mjesno pokrivanje naselja"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Mje_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Mjesno pokrivanje naselja', 'column', 'Mje_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Mjesno pokrivanje naselja', 'column', 'Mje_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Mjesno pokrivanje naselja"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Mjesno pokrivanje naselja', 'column', 'Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Mjesno pokrivanje naselja', 'column', 'Oznaka'
go

/*==============================================================*/
/* Index: MJESNO_POKRIVANJE_NASELJA2_FK                         */
/*==============================================================*/
create index MJESNO_POKRIVANJE_NASELJA2_FK on "Mjesno pokrivanje naselja" (
Oznaka ASC,
Naseljeno_mjesto_Identifikator ASC
)
go

/*==============================================================*/
/* Index: MJESNO_POKRIVANJE_NASELJA_FK                          */
/*==============================================================*/
create index MJESNO_POKRIVANJE_NASELJA_FK on "Mjesno pokrivanje naselja" (
Mje_Oznaka ASC,
"Oznaka opštine" ASC,
Identifikator ASC
)
go

/*==============================================================*/
/* Table: "Nacin placanja posiljke"                             */
/*==============================================================*/
create table "Nacin placanja posiljke" (
   Nacin_Placanja_Oznaka varchar(10)          not null,
   Nacin_Placanja       varchar(100)         not null,
   constraint "PK_NACIN PLACANJA POSILJKE" primary key (Nacin_Placanja_Oznaka)
)
go

/*==============================================================*/
/* Table: "Nacin preuzimanja"                                   */
/*==============================================================*/
create table "Nacin preuzimanja" (
   Nacin_Preuzimanja_Oznaka varchar(10)          not null,
   Nacin_Preuzimanja    varchar(100)         not null,
   constraint "PK_NACIN PREUZIMANJA" primary key (Nacin_Preuzimanja_Oznaka)
)
go

/*==============================================================*/
/* Table: "Naseljeno mjesto"                                    */
/*==============================================================*/
create table "Naseljeno mjesto" (
   Oznaka               char(3)              not null,
   Naseljeno_mjesto_Identifikator int                  not null,
   Naziv_Mjesta         varchar(120)         not null,
   PTT_Oznaka           varchar(12)          null,
   constraint "PK_NASELJENO MJESTO" primary key (Oznaka, Naseljeno_mjesto_Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Naseljeno mjesto"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Naseljeno mjesto', 'column', 'Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Naseljeno mjesto', 'column', 'Oznaka'
go

/*==============================================================*/
/* Index: SADRZI_NASELJA_FK                                     */
/*==============================================================*/
create index SADRZI_NASELJA_FK on "Naseljeno mjesto" (
Oznaka ASC
)
go

/*==============================================================*/
/* Table: "Nivo obrazovanja"                                    */
/*==============================================================*/
create table "Nivo obrazovanja" (
   Stepen               numeric(1)           not null,
   "Nivo obrazovanja"   smallint             not null,
   "Naziv nivoa"        varchar(120)         not null,
   constraint "PK_NIVO OBRAZOVANJA" primary key (Stepen, "Nivo obrazovanja")
)
go

/*==============================================================*/
/* Table: "Obrazuju za"                                         */
/*==============================================================*/
create table "Obrazuju za" (
   Stepen               numeric(1)           not null,
   "Nivo obrazovanja"   smallint             not null,
   Oznaka               char(2)              not null,
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   constraint "PK_OBRAZUJU ZA" primary key (Stepen, "Nivo obrazovanja", Oznaka, Dr_Oznaka, Poslovni_sistem_Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Obrazuju za"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Obrazuju za', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Obrazuju za', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: OBRAZUJU_ZA2_FK                                       */
/*==============================================================*/
create index OBRAZUJU_ZA2_FK on "Obrazuju za" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC
)
go

/*==============================================================*/
/* Index: OBRAZUJU_ZA_FK                                        */
/*==============================================================*/
create index OBRAZUJU_ZA_FK on "Obrazuju za" (
Stepen ASC,
"Nivo obrazovanja" ASC,
Oznaka ASC
)
go

/*==============================================================*/
/* Table: "Obuhvata naselja"                                    */
/*==============================================================*/
create table "Obuhvata naselja" (
   Nas_Oznaka           char(3)              not null,
   Naseljeno_mjesto_Identifikator int                  not null,
   Oznaka               char(1)              not null,
   "Oznaka regiona"     smallint             not null,
   constraint "PK_OBUHVATA NASELJA" primary key (Nas_Oznaka, Naseljeno_mjesto_Identifikator, Oznaka, "Oznaka regiona")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Obuhvata naselja"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Nas_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Obuhvata naselja', 'column', 'Nas_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Obuhvata naselja', 'column', 'Nas_Oznaka'
go

/*==============================================================*/
/* Index: OBUHVATA_NASELJA2_FK                                  */
/*==============================================================*/
create index OBUHVATA_NASELJA2_FK on "Obuhvata naselja" (
Oznaka ASC,
"Oznaka regiona" ASC
)
go

/*==============================================================*/
/* Index: OBUHVATA_NASELJA_FK                                   */
/*==============================================================*/
create index OBUHVATA_NASELJA_FK on "Obuhvata naselja" (
Nas_Oznaka ASC,
Naseljeno_mjesto_Identifikator ASC
)
go

/*==============================================================*/
/* Table: "Obuhvata opštine"                                    */
/*==============================================================*/
create table "Obuhvata opštine" (
   Opš_Oznaka           char(3)              not null,
   "Oznaka opštine"     numeric(3,0)         not null,
   Oznaka               char(3)              not null,
   Naseljeno_mjesto_Identifikator int                  not null,
   constraint "PK_OBUHVATA OPŠTINE" primary key (Opš_Oznaka, "Oznaka opštine", Oznaka, Naseljeno_mjesto_Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Obuhvata opštine"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Opš_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Obuhvata opštine', 'column', 'Opš_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Obuhvata opštine', 'column', 'Opš_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Obuhvata opštine"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Obuhvata opštine', 'column', 'Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Obuhvata opštine', 'column', 'Oznaka'
go

/*==============================================================*/
/* Index: OBUHVATA_OPSTINE2_FK                                  */
/*==============================================================*/
create index OBUHVATA_OPSTINE2_FK on "Obuhvata opštine" (
Oznaka ASC,
Naseljeno_mjesto_Identifikator ASC
)
go

/*==============================================================*/
/* Index: OBUHVATA_OPSTINE_FK                                   */
/*==============================================================*/
create index OBUHVATA_OPSTINE_FK on "Obuhvata opštine" (
Opš_Oznaka ASC,
"Oznaka opštine" ASC
)
go

/*==============================================================*/
/* Table: "Odnos radnih mjesta"                                 */
/*==============================================================*/
create table "Odnos radnih mjesta" (
   Kat_Dr_Oznaka2      char(3)              not null,
   Kat_Poslovni_sistem_Identifikator2 bigint               not null,
   Kat_Katalog_radnih_mjesta_Oznaka numeric(4,0)         not null,
   Kat_Dr_Oznaka       char(3)              not null,
   Kat_Poslovni_sistem_Identifikator bigint               not null,
   Katalog_radnih_mjesta_Oznaka numeric(4,0)         not null,
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Sistematizacija_Identifikator int                  not null,
   constraint "PK_ODNOS RADNIH MJESTA" primary key (Kat_Dr_Oznaka2, Kat_Poslovni_sistem_Identifikator2, Kat_Katalog_radnih_mjesta_Oznaka, Kat_Dr_Oznaka, Kat_Poslovni_sistem_Identifikator, Katalog_radnih_mjesta_Oznaka, Dr_Oznaka, Poslovni_sistem_Identifikator, Sistematizacija_Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Odnos radnih mjesta"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Kat_Dr_Oznaka2')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Odnos radnih mjesta', 'column', 'Kat_Dr_Oznaka2'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Odnos radnih mjesta', 'column', 'Kat_Dr_Oznaka2'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Odnos radnih mjesta"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Kat_Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Odnos radnih mjesta', 'column', 'Kat_Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Odnos radnih mjesta', 'column', 'Kat_Dr_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Odnos radnih mjesta"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Odnos radnih mjesta', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Odnos radnih mjesta', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: NADREDJENI_FK                                         */
/*==============================================================*/
create index NADREDJENI_FK on "Odnos radnih mjesta" (
Kat_Dr_Oznaka ASC,
Kat_Poslovni_sistem_Identifikator ASC,
Katalog_radnih_mjesta_Oznaka ASC
)
go

/*==============================================================*/
/* Index: ODNOS_RADNIH_MJESTA_U_SISTEMATIZACIJI_FK              */
/*==============================================================*/
create index ODNOS_RADNIH_MJESTA_U_SISTEMATIZACIJI_FK on "Odnos radnih mjesta" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
Sistematizacija_Identifikator ASC
)
go

/*==============================================================*/
/* Index: PODREDJENI_FK                                         */
/*==============================================================*/
create index PODREDJENI_FK on "Odnos radnih mjesta" (
Kat_Dr_Oznaka2 ASC,
Kat_Poslovni_sistem_Identifikator2 ASC,
Kat_Katalog_radnih_mjesta_Oznaka ASC
)
go

/*==============================================================*/
/* Table: "Odrzavanje vozila"                                   */
/*==============================================================*/
create table "Odrzavanje vozila" (
   Datum_Poslednjeg_Servisa datetime             not null,
   Tip_Vozila_Oznaka    varchar(10)          not null,
   Vozilo_Identifikator int                  not null,
   Odrzavanje_Vozila_Identifikator int                  not null,
   Opis_Servisa         char(200)            null,
   Troskovi_Servisa     decimal(6,2)         not null,
   constraint "PK_ODRZAVANJE VOZILA" primary key (Odrzavanje_Vozila_Identifikator)
)
go

/*==============================================================*/
/* Index: PODACI_O_ODRZAVANJU_VOZILA_FK                         */
/*==============================================================*/
create index PODACI_O_ODRZAVANJU_VOZILA_FK on "Odrzavanje vozila" (
Tip_Vozila_Oznaka ASC,
Vozilo_Identifikator ASC
)
go

/*==============================================================*/
/* Table: Opština                                               */
/*==============================================================*/
create table Opština (
   Oznaka               char(3)              not null,
   "Oznaka opštine"     numeric(3,0)         not null,
   Nas_Oznaka           char(3)              null,
   Naseljeno_mjesto_Identifikator int                  null,
   "Naziv opštine"      varchar(120)         not null,
   constraint PK_OPŠTINA primary key (Oznaka, "Oznaka opštine")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('Opština')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Opština', 'column', 'Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Opština', 'column', 'Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('Opština')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Nas_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Opština', 'column', 'Nas_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Opština', 'column', 'Nas_Oznaka'
go

/*==============================================================*/
/* Index: LOKALNA_SAMOUPRAVA_FK                                 */
/*==============================================================*/
create index LOKALNA_SAMOUPRAVA_FK on Opština (
Oznaka ASC
)
go

/*==============================================================*/
/* Index: SJEDISTE_OPSTINE_FK                                   */
/*==============================================================*/
create index SJEDISTE_OPSTINE_FK on Opština (
Nas_Oznaka ASC,
Naseljeno_mjesto_Identifikator ASC
)
go

/*==============================================================*/
/* Table: "Organizaciona jedinica"                              */
/*==============================================================*/
create table "Organizaciona jedinica" (
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Organizaciona_Jedinica_Identifikator numeric(4)           not null,
   Oznaka               char(1)              not null,
   Iza_Dr_Oznaka       char(3)              not null,
   Iza_Poslovni_sistem_Identifikator bigint               not null,
   Nas_Oznaka           char(3)              not null,
   Naseljeno_mjesto_Identifikator int                  not null,
   Naziv                varchar(120)         not null,
   Adresa               varchar(120)         null,
   Telefon              varchar(11)          null,
   email                varchar(60)          null,
   constraint "PK_ORGANIZACIONA JEDINICA" primary key (Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Organizaciona jedinica"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Organizaciona jedinica', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Organizaciona jedinica', 'column', 'Dr_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Organizaciona jedinica"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Iza_Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Organizaciona jedinica', 'column', 'Iza_Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Organizaciona jedinica', 'column', 'Iza_Dr_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Organizaciona jedinica"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Nas_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Organizaciona jedinica', 'column', 'Nas_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Organizaciona jedinica', 'column', 'Nas_Oznaka'
go

/*==============================================================*/
/* Index: SJEDISTE_ORGANIZACIONE_JEDINICE_FK                    */
/*==============================================================*/
create index SJEDISTE_ORGANIZACIONE_JEDINICE_FK on "Organizaciona jedinica" (
Nas_Oznaka ASC,
Naseljeno_mjesto_Identifikator ASC
)
go

/*==============================================================*/
/* Index: TIPIZACIJA_ORGANIZACIONE_JEDINICE_FK                  */
/*==============================================================*/
create index TIPIZACIJA_ORGANIZACIONE_JEDINICE_FK on "Organizaciona jedinica" (
Oznaka ASC,
Iza_Dr_Oznaka ASC,
Iza_Poslovni_sistem_Identifikator ASC
)
go

/*==============================================================*/
/* Index: UNUTRASNJA_ORGANIZACIJA_FK                            */
/*==============================================================*/
create index UNUTRASNJA_ORGANIZACIJA_FK on "Organizaciona jedinica" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC
)
go

/*==============================================================*/
/* Table: "Personalna restrikcija"                              */
/*==============================================================*/
create table "Personalna restrikcija" (
   Atr_Dr_Oznaka       char(3)              not null,
   Atr_Poslovni_sistem_Identifikator bigint               not null,
   Atr_Identifikator    bigint               not null,
   Tab_Dr_Oznaka       char(3)              not null,
   Tab_Poslovni_sistem_Identifikator bigint               not null,
   Tab_Identifikator    bigint               not null,
   Pos_Dr_Oznaka       char(3)              not null,
   Pos_Poslovni_sistem_Identifikator bigint               not null,
   "User ID"            varchar(30)          not null,
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   "Oznaka role"        char(2)              not null,
   Identifikator        bigint               not null,
   Dodavanje            bit                  not null,
   Brisanje             bit                  not null,
   Izmjena              bit                  not null,
   Pretraga             bit                  not null,
   constraint "PK_PERSONALNA RESTRIKCIJA" primary key (Atr_Dr_Oznaka, Atr_Poslovni_sistem_Identifikator, Atr_Identifikator, Tab_Dr_Oznaka, Tab_Poslovni_sistem_Identifikator, Tab_Identifikator, Pos_Dr_Oznaka, Pos_Poslovni_sistem_Identifikator, "User ID", Dr_Oznaka, Poslovni_sistem_Identifikator, "Oznaka role", Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Personalna restrikcija"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Pos_Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Personalna restrikcija', 'column', 'Pos_Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Personalna restrikcija', 'column', 'Pos_Dr_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Personalna restrikcija"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Personalna restrikcija', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Personalna restrikcija', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: PERSONALNA_RESTRIKCIJA2_FK                            */
/*==============================================================*/
create index PERSONALNA_RESTRIKCIJA2_FK on "Personalna restrikcija" (
Pos_Dr_Oznaka ASC,
Pos_Poslovni_sistem_Identifikator ASC,
"User ID" ASC,
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
"Oznaka role" ASC,
Identifikator ASC
)
go

/*==============================================================*/
/* Index: PERSONALNA_RESTRIKCIJA_FK                             */
/*==============================================================*/
create index PERSONALNA_RESTRIKCIJA_FK on "Personalna restrikcija" (
Atr_Dr_Oznaka ASC,
Atr_Poslovni_sistem_Identifikator ASC,
Atr_Identifikator ASC
)
go

/*==============================================================*/
/* Index: PERSONALNA_RESTRIKCIJA3_FK                            */
/*==============================================================*/
create index PERSONALNA_RESTRIKCIJA3_FK on "Personalna restrikcija" (
Tab_Dr_Oznaka ASC,
Tab_Poslovni_sistem_Identifikator ASC,
Tab_Identifikator ASC
)
go

/*==============================================================*/
/* Table: "Podaci o obrazovanju"                                */
/*==============================================================*/
create table "Podaci o obrazovanju" (
   Reg_Dr_Oznaka       char(3)              not null,
   Reg_Poslovni_sistem_Identifikator bigint               not null,
   Redni_Broj_Evidencije_Zaposlenih int                  not null,
   "Redni broj"         numeric(2,0)         not null,
   Stepen               numeric(1)           not null,
   "Nivo obrazovanja"   smallint             not null,
   Oznaka               char(2)              not null,
   Kat_Dr_Oznaka       char(3)              not null,
   Kat_Oznaka           char(2)              not null,
   Dr_Oznaka           char(3)              null,
   Poslovni_sistem_Identifikator bigint               null,
   "Datum upisa"        datetime             not null,
   "Datum završetka"    datetime             not null,
   "Datum diplomiranja" datetime             null,
   "Broj diplome"       varchar(14)          null,
   constraint "PK_PODACI O OBRAZOVANJU" primary key (Reg_Dr_Oznaka, Reg_Poslovni_sistem_Identifikator, Redni_Broj_Evidencije_Zaposlenih, "Redni broj")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Podaci o obrazovanju"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Reg_Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Podaci o obrazovanju', 'column', 'Reg_Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Podaci o obrazovanju', 'column', 'Reg_Dr_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Podaci o obrazovanju"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Kat_Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Podaci o obrazovanju', 'column', 'Kat_Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Podaci o obrazovanju', 'column', 'Kat_Dr_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Podaci o obrazovanju"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Podaci o obrazovanju', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Podaci o obrazovanju', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: OBRAZOVNA_USTANOVA_FK                                 */
/*==============================================================*/
create index OBRAZOVNA_USTANOVA_FK on "Podaci o obrazovanju" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC
)
go

/*==============================================================*/
/* Index: PODACI_O_OBRAZOVANJU_FK                               */
/*==============================================================*/
create index PODACI_O_OBRAZOVANJU_FK on "Podaci o obrazovanju" (
Reg_Dr_Oznaka ASC,
Reg_Poslovni_sistem_Identifikator ASC,
Redni_Broj_Evidencije_Zaposlenih ASC
)
go

/*==============================================================*/
/* Index: TIPIZACIJA_ZVANJA_FK                                  */
/*==============================================================*/
create index TIPIZACIJA_ZVANJA_FK on "Podaci o obrazovanju" (
Kat_Dr_Oznaka ASC,
Kat_Oznaka ASC
)
go

/*==============================================================*/
/* Index: TIPIZACIJA_SKOLSKE_SPREMA_FK                          */
/*==============================================================*/
create index TIPIZACIJA_SKOLSKE_SPREMA_FK on "Podaci o obrazovanju" (
Stepen ASC,
"Nivo obrazovanja" ASC,
Oznaka ASC
)
go

/*==============================================================*/
/* Table: Posiljka                                              */
/*==============================================================*/
create table Posiljka (
   Posiljka_Identifikator varchar(20)          not null,
   Tip_Posiljke_Oznaka  varchar(10)          not null,
   Tip_Transporta_Oznaka varchar(10)          not null,
   Ugovor_O_Transportu_Identifikator varchar(10)          null,
   Oznaka               char(3)              not null,
   Naseljeno_mjesto_Identifikator int                  not null,
   Status_Posiljke_Oznaka varchar(10)          not null,
   Status_Reklamacije_Oznaka varchar(10)          null,
   Naziv_Posiljke       varchar(200)         not null,
   Datum_Prijema        datetime             not null,
   Datum_Isporuke       datetime             null,
   Duzina_Cm            int                  not null,
   Sirina_Cm            int                  not null,
   Visina_Cm            int                  not null,
   Tezina_Kg            decimal(3,1)         not null,
   Lomljivo             bit                  not null,
   constraint PK_POSILJKA primary key (Posiljka_Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('Posiljka')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Posiljka', 'column', 'Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Posiljka', 'column', 'Oznaka'
go

/*==============================================================*/
/* Index: MJESTO_DOSTAVE_FK                                     */
/*==============================================================*/
create index MJESTO_DOSTAVE_FK on Posiljka (
Oznaka ASC,
Naseljeno_mjesto_Identifikator ASC
)
go

/*==============================================================*/
/* Index: PREDMET_UGOVORA_FK                                    */
/*==============================================================*/
create index PREDMET_UGOVORA_FK on Posiljka (
Ugovor_O_Transportu_Identifikator ASC
)
go

/*==============================================================*/
/* Index: STATUS_POSILJKE_FK                                    */
/*==============================================================*/
create index STATUS_POSILJKE_FK on Posiljka (
Status_Posiljke_Oznaka ASC
)
go

/*==============================================================*/
/* Index: STATUS_REKLAMACIJE_FK                                 */
/*==============================================================*/
create index STATUS_REKLAMACIJE_FK on Posiljka (
Status_Reklamacije_Oznaka ASC
)
go

/*==============================================================*/
/* Index: TIP_POSILJKE_FK                                       */
/*==============================================================*/
create index TIP_POSILJKE_FK on Posiljka (
Tip_Posiljke_Oznaka ASC
)
go

/*==============================================================*/
/* Index: TIP_TRANSPORTA_POSILJKE_FK                            */
/*==============================================================*/
create index TIP_TRANSPORTA_POSILJKE_FK on Posiljka (
Tip_Transporta_Oznaka ASC
)
go

/*==============================================================*/
/* Table: "Posiljke u transportu"                               */
/*==============================================================*/
create table "Posiljke u transportu" (
   Posiljka_Identifikator varchar(20)          not null,
   Vozilo_Identifikator int                  not null,
   Tip_Vozila_Oznaka    varchar(10)          not null,
   constraint "PK_POSILJKE U TRANSPORTU" primary key (Posiljka_Identifikator)
)
go

/*==============================================================*/
/* Index: VOZILO_SADRZI_POSILJKU_FK                             */
/*==============================================================*/
create index VOZILO_SADRZI_POSILJKU_FK on "Posiljke u transportu" (
Tip_Vozila_Oznaka ASC,
Vozilo_Identifikator ASC
)
go

/*==============================================================*/
/* Table: "Poslovni sistem"                                     */
/*==============================================================*/
create table "Poslovni sistem" (
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Pos_Dr_Oznaka       char(3)              null,
   Pos_Poslovni_sistem_Identifikator bigint               null,
   Oznaka               char(1)              not null,
   Nas_Oznaka           char(3)              not null,
   Naseljeno_mjesto_Identifikator int                  not null,
   Naziv                varchar(120)         not null,
   Adresa               varchar(120)         null,
   Telefon              varchar(11)          null,
   email                varchar(60)          null,
   www                  varchar(120)         null,
   "Registracioni broj" char(10)             not null,
   PIB                  char(11)             not null,
   "Datum registracije" datetime             not null,
   "Datum zatvaranja"   datetime             null,
   Memorandum           image                null,
   Logo                 image                null,
   Pecat                image                null,
   "Digitalni potpis"   image                null,
   constraint "PK_POSLOVNI SISTEM" primary key (Dr_Oznaka, Poslovni_sistem_Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Poslovni sistem"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Poslovni sistem', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Poslovni sistem', 'column', 'Dr_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Poslovni sistem"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Pos_Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Poslovni sistem', 'column', 'Pos_Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Poslovni sistem', 'column', 'Pos_Dr_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Poslovni sistem"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Nas_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Poslovni sistem', 'column', 'Nas_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Poslovni sistem', 'column', 'Nas_Oznaka'
go

/*==============================================================*/
/* Index: DRZAVA_POSLOVNOG_SISTEMA_FK                           */
/*==============================================================*/
create index DRZAVA_POSLOVNOG_SISTEMA_FK on "Poslovni sistem" (
Dr_Oznaka ASC
)
go

/*==============================================================*/
/* Index: PRAVNI_SLJEDBENIK_FK                                  */
/*==============================================================*/
create index PRAVNI_SLJEDBENIK_FK on "Poslovni sistem" (
Pos_Dr_Oznaka ASC,
Pos_Poslovni_sistem_Identifikator ASC
)
go

/*==============================================================*/
/* Index: SJEDISTE_POSLOVNOG_SISTEMA_FK                         */
/*==============================================================*/
create index SJEDISTE_POSLOVNOG_SISTEMA_FK on "Poslovni sistem" (
Nas_Oznaka ASC,
Naseljeno_mjesto_Identifikator ASC
)
go

/*==============================================================*/
/* Index: TIPIZACIJA_POSLOVNOG_SISTEMA_FK                       */
/*==============================================================*/
create index TIPIZACIJA_POSLOVNOG_SISTEMA_FK on "Poslovni sistem" (
Oznaka ASC
)
go

/*==============================================================*/
/* Table: "Potrebna školska sprema"                             */
/*==============================================================*/
create table "Potrebna školska sprema" (
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Katalog_radnih_mjesta_Oznaka numeric(4,0)         not null,
   Stepen               numeric(1)           not null,
   "Nivo obrazovanja"   smallint             not null,
   Oznaka               char(2)              not null,
   constraint "PK_POTREBNA ŠKOLSKA SPREMA" primary key (Dr_Oznaka, Poslovni_sistem_Identifikator, Katalog_radnih_mjesta_Oznaka, Stepen, "Nivo obrazovanja", Oznaka)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Potrebna školska sprema"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Potrebna školska sprema', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Potrebna školska sprema', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: POTREBNA_SKOLSKA_SPREMA2_FK                           */
/*==============================================================*/
create index POTREBNA_SKOLSKA_SPREMA2_FK on "Potrebna školska sprema" (
Stepen ASC,
"Nivo obrazovanja" ASC,
Oznaka ASC
)
go

/*==============================================================*/
/* Index: POTREBNA_SKOLSKA_SPREMA_FK                            */
/*==============================================================*/
create index POTREBNA_SKOLSKA_SPREMA_FK on "Potrebna školska sprema" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
Katalog_radnih_mjesta_Oznaka ASC
)
go

/*==============================================================*/
/* Table: "Potrebne spreme"                                     */
/*==============================================================*/
create table "Potrebne spreme" (
   Stepen               numeric(1)           not null,
   "Nivo obrazovanja"   smallint             not null,
   Ško_Oznaka           char(2)              not null,
   Oznaka               char(3)              not null,
   Zanimanje            int                  not null,
   constraint "PK_POTREBNE SPREME" primary key (Stepen, "Nivo obrazovanja", Ško_Oznaka, Oznaka, Zanimanje)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Potrebne spreme"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Potrebne spreme', 'column', 'Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Potrebne spreme', 'column', 'Oznaka'
go

/*==============================================================*/
/* Index: POTREBNE_SPREME_FK                                    */
/*==============================================================*/
create index POTREBNE_SPREME_FK on "Potrebne spreme" (
Stepen ASC,
"Nivo obrazovanja" ASC,
Ško_Oznaka ASC
)
go

/*==============================================================*/
/* Index: POTREBNE_SPREME2_FK                                   */
/*==============================================================*/
create index POTREBNE_SPREME2_FK on "Potrebne spreme" (
Oznaka ASC,
Zanimanje ASC
)
go

/*==============================================================*/
/* Table: "Povezana sa"                                         */
/*==============================================================*/
create table "Povezana sa" (
   Tab_Poslovni_sistem_Identifikator bigint               not null,
   Tab_Identifikator    bigint               not null,
   Tab_Dr_Oznaka       char(3)              not null,
   constraint "PK_POVEZANA SA" primary key (Tab_Poslovni_sistem_Identifikator, Tab_Identifikator, Tab_Dr_Oznaka)
)
go

/*==============================================================*/
/* Index: POVEZANA_SA_FK                                        */
/*==============================================================*/
create index POVEZANA_SA_FK on "Povezana sa" (
Tab_Dr_Oznaka ASC,
Tab_Poslovni_sistem_Identifikator ASC,
Tab_Identifikator ASC
)
go

/*==============================================================*/
/* Table: "Pravni nasljednik"                                   */
/*==============================================================*/
create table "Pravni nasljednik" (
   Dr_Oznaka           char(3)              not null,
   Oznaka               char(3)              not null,
   constraint "PK_PRAVNI NASLJEDNIK" primary key (Dr_Oznaka, Oznaka)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Pravni nasljednik"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Pravni nasljednik', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Pravni nasljednik', 'column', 'Dr_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Pravni nasljednik"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Pravni nasljednik', 'column', 'Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Pravni nasljednik', 'column', 'Oznaka'
go

/*==============================================================*/
/* Index: PRAVNI_NASLJEDNIK_FK                                  */
/*==============================================================*/
create index PRAVNI_NASLJEDNIK_FK on "Pravni nasljednik" (
Dr_Oznaka ASC
)
go

/*==============================================================*/
/* Index: PRAVNI_NASLJEDNIK2_FK                                 */
/*==============================================================*/
create index PRAVNI_NASLJEDNIK2_FK on "Pravni nasljednik" (
Oznaka ASC
)
go

/*==============================================================*/
/* Table: "Pravno lice"                                         */
/*==============================================================*/
create table "Pravno lice" (
   Pravno_Lice_Identifikator varchar(10)          not null,
   Naziv                varchar(100)         not null,
   Email                varchar(100)         null,
   Telefon              varchar(10)          not null,
   constraint "PK_PRAVNO LICE" primary key (Pravno_Lice_Identifikator)
)
go

/*==============================================================*/
/* Table: "Pravo na podsistem"                                  */
/*==============================================================*/
create table "Pravo na podsistem" (
   Sis_Dr_Oznaka       char(3)              not null,
   Sis_Poslovni_sistem_Identifikator bigint               not null,
   Identifikator        bigint               not null,
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   "Oznaka role"        char(2)              not null,
   Pristup              bit                  not null,
   constraint "PK_PRAVO NA PODSISTEM" primary key (Sis_Dr_Oznaka, Sis_Poslovni_sistem_Identifikator, Identifikator, Dr_Oznaka, Poslovni_sistem_Identifikator, "Oznaka role")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Pravo na podsistem"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Pravo na podsistem', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Pravo na podsistem', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: PRAVO_NA_PODSISTEM_FK                                 */
/*==============================================================*/
create index PRAVO_NA_PODSISTEM_FK on "Pravo na podsistem" (
Sis_Dr_Oznaka ASC,
Sis_Poslovni_sistem_Identifikator ASC,
Identifikator ASC
)
go

/*==============================================================*/
/* Index: PRAVO_NA_PODSISTEM2_FK                                */
/*==============================================================*/
create index PRAVO_NA_PODSISTEM2_FK on "Pravo na podsistem" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
"Oznaka role" ASC
)
go

/*==============================================================*/
/* Table: "Predefinisane role radnih mjesta"                    */
/*==============================================================*/
create table "Predefinisane role radnih mjesta" (
   Rol_Dr_Oznaka       char(3)              not null,
   Rol_Poslovni_sistem_Identifikator bigint               not null,
   "Oznaka role"        char(2)              not null,
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Katalog_radnih_mjesta_Oznaka numeric(4,0)         not null,
   constraint "PK_PREDEFINISANE ROLE RADNIH M" primary key (Rol_Dr_Oznaka, Rol_Poslovni_sistem_Identifikator, "Oznaka role", Dr_Oznaka, Poslovni_sistem_Identifikator, Katalog_radnih_mjesta_Oznaka)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Predefinisane role radnih mjesta"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Rol_Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Predefinisane role radnih mjesta', 'column', 'Rol_Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Predefinisane role radnih mjesta', 'column', 'Rol_Dr_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Predefinisane role radnih mjesta"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Predefinisane role radnih mjesta', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Predefinisane role radnih mjesta', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: PREDEFINISANE_ROLE_RADNIH_MJESTA_FK                   */
/*==============================================================*/
create index PREDEFINISANE_ROLE_RADNIH_MJESTA_FK on "Predefinisane role radnih mjesta" (
Rol_Dr_Oznaka ASC,
Rol_Poslovni_sistem_Identifikator ASC,
"Oznaka role" ASC
)
go

/*==============================================================*/
/* Index: PREDEFINISANE_ROLE_RADNIH_MJESTA2_FK                  */
/*==============================================================*/
create index PREDEFINISANE_ROLE_RADNIH_MJESTA2_FK on "Predefinisane role radnih mjesta" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
Katalog_radnih_mjesta_Oznaka ASC
)
go

/*==============================================================*/
/* Table: "Pripada roli"                                        */
/*==============================================================*/
create table "Pripada roli" (
   Pos_Dr_Oznaka       char(3)              not null,
   Pos_Poslovni_sistem_Identifikator bigint               not null,
   "User ID"            varchar(30)          not null,
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   "Oznaka role"        char(2)              not null,
   Identifikator        bigint               not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   constraint "PK_PRIPADA ROLI" primary key (Pos_Dr_Oznaka, Pos_Poslovni_sistem_Identifikator, "User ID", Dr_Oznaka, Poslovni_sistem_Identifikator, "Oznaka role", Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Pripada roli"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Pos_Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Pripada roli', 'column', 'Pos_Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Pripada roli', 'column', 'Pos_Dr_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Pripada roli"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Pripada roli', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Pripada roli', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: KO_JE_U_GRUPI_FK                                      */
/*==============================================================*/
create index KO_JE_U_GRUPI_FK on "Pripada roli" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
"Oznaka role" ASC
)
go

/*==============================================================*/
/* Index: SVRSTAN_U_GRUPU_FK                                    */
/*==============================================================*/
create index SVRSTAN_U_GRUPU_FK on "Pripada roli" (
Pos_Dr_Oznaka ASC,
Pos_Poslovni_sistem_Identifikator ASC,
"User ID" ASC
)
go

/*==============================================================*/
/* Table: "Radna mjesta u Organizacionoj jedinici"              */
/*==============================================================*/
create table "Radna mjesta u Organizacionoj jedinici" (
   Org_Dr_Oznaka       char(3)              not null,
   Org_Poslovni_sistem_Identifikator bigint               not null,
   Organizaciona_Jedinica_Identifikator numeric(4)           not null,
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Katalog_radnih_mjesta_Oznaka numeric(4,0)         not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   constraint "PK_RADNA MJESTA U ORGANIZACION" primary key (Org_Dr_Oznaka, Org_Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator, Dr_Oznaka, Poslovni_sistem_Identifikator, Katalog_radnih_mjesta_Oznaka)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Radna mjesta u Organizacionoj jedinici"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Org_Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Radna mjesta u Organizacionoj jedinici', 'column', 'Org_Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Radna mjesta u Organizacionoj jedinici', 'column', 'Org_Dr_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Radna mjesta u Organizacionoj jedinici"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Radna mjesta u Organizacionoj jedinici', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Radna mjesta u Organizacionoj jedinici', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: ORGANIZACIONA_JEDINICA_SADRZI_KATALOG_FK              */
/*==============================================================*/
create index ORGANIZACIONA_JEDINICA_SADRZI_KATALOG_FK on "Radna mjesta u Organizacionoj jedinici" (
Org_Dr_Oznaka ASC,
Org_Poslovni_sistem_Identifikator ASC,
Organizaciona_Jedinica_Identifikator ASC
)
go

/*==============================================================*/
/* Index: RADNO_MJESTO_U_KATALOGU_ORGANIZACIONEJ_JEDINICE_FK    */
/*==============================================================*/
create index RADNO_MJESTO_U_KATALOGU_ORGANIZACIONEJ_JEDINICE_FK on "Radna mjesta u Organizacionoj jedinici" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
Katalog_radnih_mjesta_Oznaka ASC
)
go

/*==============================================================*/
/* Table: "Raspored na radna mjesta"                            */
/*==============================================================*/
create table "Raspored na radna mjesta" (
   Reg_Dr_Oznaka       char(3)              not null,
   Reg_Poslovni_sistem_Identifikator bigint               not null,
   Redni_Broj_Evidencije_Zaposlenih int                  not null,
   "Redni broj"         numeric(4,0)         not null,
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Organizaciona_Jedinica_Identifikator numeric(4)           not null,
   Oznaka               char(2)              not null,
   Kat_Dr_Oznaka       char(3)              not null,
   Kat_Poslovni_sistem_Identifikator bigint               not null,
   Katalog_radnih_mjesta_Oznaka numeric(4,0)         not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   "Sta godina"        numeric(2)           not null,
   "Sta mjeseci"       numeric(2)           not null,
   "Sta dana"          numeric(2)           not null,
   constraint "PK_RASPORED NA RADNA MJESTA" primary key (Reg_Dr_Oznaka, Reg_Poslovni_sistem_Identifikator, Redni_Broj_Evidencije_Zaposlenih, "Redni broj")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Raspored na radna mjesta"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Reg_Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Raspored na radna mjesta', 'column', 'Reg_Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Raspored na radna mjesta', 'column', 'Reg_Dr_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Raspored na radna mjesta"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Raspored na radna mjesta', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Raspored na radna mjesta', 'column', 'Dr_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Raspored na radna mjesta"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Kat_Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Raspored na radna mjesta', 'column', 'Kat_Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Raspored na radna mjesta', 'column', 'Kat_Dr_Oznaka'
go

/*==============================================================*/
/* Index: KADROVI_U_ORGANIZACIONOJ_JEDINICI_FK                  */
/*==============================================================*/
create index KADROVI_U_ORGANIZACIONOJ_JEDINICI_FK on "Raspored na radna mjesta" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
Organizaciona_Jedinica_Identifikator ASC
)
go

/*==============================================================*/
/* Index: RASPORED_ZAPOSLENIH_FK                                */
/*==============================================================*/
create index RASPORED_ZAPOSLENIH_FK on "Raspored na radna mjesta" (
Kat_Dr_Oznaka ASC,
Kat_Poslovni_sistem_Identifikator ASC,
Katalog_radnih_mjesta_Oznaka ASC
)
go

/*==============================================================*/
/* Index: RASPORED_ZAPOSLENOG_FK                                */
/*==============================================================*/
create index RASPORED_ZAPOSLENOG_FK on "Raspored na radna mjesta" (
Reg_Dr_Oznaka ASC,
Reg_Poslovni_sistem_Identifikator ASC,
Redni_Broj_Evidencije_Zaposlenih ASC
)
go

/*==============================================================*/
/* Index: TIPIZACIJA_RADNOG_ODNOSA_FK                           */
/*==============================================================*/
create index TIPIZACIJA_RADNOG_ODNOSA_FK on "Raspored na radna mjesta" (
Oznaka ASC
)
go

/*==============================================================*/
/* Table: Region                                                */
/*==============================================================*/
create table Region (
   Oznaka               char(1)              not null,
   "Oznaka regiona"     smallint             not null,
   Dr_Oznaka           char(3)              null,
   Nas_Oznaka           char(3)              null,
   Naseljeno_mjesto_Identifikator int                  null,
   "Naziv regiona"      varchar(120)         not null,
   constraint PK_REGION primary key (Oznaka, "Oznaka regiona")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('Region')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Region', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Region', 'column', 'Dr_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('Region')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Nas_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Region', 'column', 'Nas_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Region', 'column', 'Nas_Oznaka'
go

/*==============================================================*/
/* Index: TIPIZACIJA_REGIONA_FK                                 */
/*==============================================================*/
create index TIPIZACIJA_REGIONA_FK on Region (
Oznaka ASC
)
go

/*==============================================================*/
/* Index: MATICNA_DRZAVA_FK                                     */
/*==============================================================*/
create index MATICNA_DRZAVA_FK on Region (
Dr_Oznaka ASC
)
go

/*==============================================================*/
/* Index: ADMINISTRATIVNO_SJEDISTE_FK                           */
/*==============================================================*/
create index ADMINISTRATIVNO_SJEDISTE_FK on Region (
Nas_Oznaka ASC,
Naseljeno_mjesto_Identifikator ASC
)
go

/*==============================================================*/
/* Table: "Registar zaposlenih"                                 */
/*==============================================================*/
create table "Registar zaposlenih" (
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Redni_Broj_Evidencije_Zaposlenih int                  not null,
   Prezime              varchar(60)          not null,
   Ime_Roditelja        varchar(60)          null,
   Ime                  varchar(60)          not null,
   Pol                  char(1)              not null default ''
      constraint CKC_POL_REGISTAR check (Pol in ('M','','N')),
   Maticni_Broj         varchar(13)          null,
   constraint "PK_REGISTAR ZAPOSLENIH" primary key (Dr_Oznaka, Poslovni_sistem_Identifikator, Redni_Broj_Evidencije_Zaposlenih)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Registar zaposlenih"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Registar zaposlenih', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Registar zaposlenih', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: ZAPOSLJAVA_FK                                         */
/*==============================================================*/
create index ZAPOSLJAVA_FK on "Registar zaposlenih" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC
)
go

/*==============================================================*/
/* Table: "Restrikcija atributa"                                */
/*==============================================================*/
create table "Restrikcija atributa" (
   Atr_Dr_Oznaka       char(3)              not null,
   Atr_Poslovni_sistem_Identifikator bigint               not null,
   Identifikator        bigint               not null,
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   "Oznaka role"        char(2)              not null,
   Dodavanje            bit                  not null,
   Izmjena              bit                  not null,
   Brisanje             bit                  not null,
   Pretraga             bit                  not null,
   constraint "PK_RESTRIKCIJA ATRIBUTA" primary key (Atr_Dr_Oznaka, Atr_Poslovni_sistem_Identifikator, Identifikator, Dr_Oznaka, Poslovni_sistem_Identifikator, "Oznaka role")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Restrikcija atributa"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Restrikcija atributa', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Restrikcija atributa', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: RESTRIKCIJA_ATRIBUTA2_FK                              */
/*==============================================================*/
create index RESTRIKCIJA_ATRIBUTA2_FK on "Restrikcija atributa" (
Atr_Dr_Oznaka ASC,
Atr_Poslovni_sistem_Identifikator ASC,
Identifikator ASC
)
go

/*==============================================================*/
/* Index: RESTRIKCIJA_ATRIBUTA_FK                               */
/*==============================================================*/
create index RESTRIKCIJA_ATRIBUTA_FK on "Restrikcija atributa" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
"Oznaka role" ASC
)
go

/*==============================================================*/
/* Table: "Restrikcija nad tabelama"                            */
/*==============================================================*/
create table "Restrikcija nad tabelama" (
   Tab_Dr_Oznaka       char(3)              not null,
   Tab_Poslovni_sistem_Identifikator bigint               not null,
   Identifikator        bigint               not null,
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   "Oznaka role"        char(2)              not null,
   Dodavanje            bit                  not null,
   Brisanje             bit                  not null,
   Izmjena              bit                  not null,
   Pretraga             bit                  not null,
   constraint "PK_RESTRIKCIJA NAD TABELAMA" primary key (Tab_Dr_Oznaka, Tab_Poslovni_sistem_Identifikator, Identifikator, Dr_Oznaka, Poslovni_sistem_Identifikator, "Oznaka role")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Restrikcija nad tabelama"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Restrikcija nad tabelama', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Restrikcija nad tabelama', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: RESTRIKCIJA_NAD_TABELAMA_FK                           */
/*==============================================================*/
create index RESTRIKCIJA_NAD_TABELAMA_FK on "Restrikcija nad tabelama" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
"Oznaka role" ASC
)
go

/*==============================================================*/
/* Index: RESTRIKCIJA_NAD_TABELAMA2_FK                          */
/*==============================================================*/
create index RESTRIKCIJA_NAD_TABELAMA2_FK on "Restrikcija nad tabelama" (
Tab_Dr_Oznaka ASC,
Tab_Poslovni_sistem_Identifikator ASC,
Identifikator ASC
)
go

/*==============================================================*/
/* Table: Rola                                                  */
/*==============================================================*/
create table Rola (
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   "Oznaka role"        char(2)              not null,
   Prioritet            smallint             not null,
   "Naziv role"         varchar(80)          not null,
   Opis                 varchar(1000)        null,
   constraint PK_ROLA primary key (Dr_Oznaka, Poslovni_sistem_Identifikator, "Oznaka role")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('Rola')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Rola', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Rola', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: ROLE_POSLOVNOG_SISTEMA_FK                             */
/*==============================================================*/
create index ROLE_POSLOVNOG_SISTEMA_FK on Rola (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC
)
go

/*==============================================================*/
/* Table: "Sadri atribute"                                     */
/*==============================================================*/
create table "Sadri atribute" (
   Atr_Dr_Oznaka       char(3)              not null,
   Atr_Identifikator    bigint               not null,
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Identifikator        bigint               not null,
   constraint "PK_SADRI ATRIBUTE" primary key (Atr_Dr_Oznaka, Atr_Identifikator, Dr_Oznaka, Poslovni_sistem_Identifikator, Identifikator)
)
go

/*==============================================================*/
/* Index: SADRZI_ATRIBUTE_FK                                    */
/*==============================================================*/
create index SADRZI_ATRIBUTE_FK on "Sadri atribute" (
Atr_Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
Atr_Identifikator ASC
)
go

/*==============================================================*/
/* Index: SADRZI_ATRIBUTE2_FK                                   */
/*==============================================================*/
create index SADRZI_ATRIBUTE2_FK on "Sadri atribute" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
Identifikator ASC
)
go

/*==============================================================*/
/* Table: "Sadri podsisteme"                                   */
/*==============================================================*/
create table "Sadri podsisteme" (
   Sis_Dr_Oznaka       char(3)              not null,
   Sis_Poslovni_sistem_Identifikator bigint               not null,
   Sis_Identifikator    bigint               not null,
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Identifikator        bigint               not null,
   constraint "PK_SADRI PODSISTEME" primary key (Sis_Dr_Oznaka, Sis_Poslovni_sistem_Identifikator, Sis_Identifikator, Dr_Oznaka, Poslovni_sistem_Identifikator, Identifikator)
)
go

/*==============================================================*/
/* Index: SADRZI_PODSISTEME_FK                                  */
/*==============================================================*/
create index SADRZI_PODSISTEME_FK on "Sadri podsisteme" (
Sis_Dr_Oznaka ASC,
Sis_Poslovni_sistem_Identifikator ASC,
Sis_Identifikator ASC
)
go

/*==============================================================*/
/* Index: SADRZI_PODSISTEME2_FK                                 */
/*==============================================================*/
create index SADRZI_PODSISTEME2_FK on "Sadri podsisteme" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
Identifikator ASC
)
go

/*==============================================================*/
/* Table: "Sadri tabele"                                       */
/*==============================================================*/
create table "Sadri tabele" (
   Tab_Identifikator    bigint               not null,
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Identifikator        bigint               not null,
   constraint "PK_SADRI TABELE" primary key (Tab_Identifikator, Dr_Oznaka, Poslovni_sistem_Identifikator, Identifikator)
)
go

/*==============================================================*/
/* Index: SADRZI_TABELE2_FK                                     */
/*==============================================================*/
create index SADRZI_TABELE2_FK on "Sadri tabele" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
Identifikator ASC
)
go

/*==============================================================*/
/* Index: SADRZI_TABELE_FK                                      */
/*==============================================================*/
create index SADRZI_TABELE_FK on "Sadri tabele" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
Tab_Identifikator ASC
)
go

/*==============================================================*/
/* Table: "Sastav drava"                                       */
/*==============================================================*/
create table "Sastav drava" (
   Dr_Oznaka           char(3)              not null,
   Oznaka               char(3)              not null,
   "Redni broj"         numeric(2,0)         not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   constraint "PK_SASTAV DRZAVA" primary key (Dr_Oznaka, Oznaka, "Redni broj")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Sastav drava"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Sastav drava', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Sastav drava', 'column', 'Dr_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Sastav drava"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Sastav drava', 'column', 'Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Sastav drava', 'column', 'Oznaka'
go

/*==============================================================*/
/* Index: SLOZENA_DRZAVA_FK                                     */
/*==============================================================*/
create index SLOZENA_DRZAVA_FK on "Sastav drava" (
Oznaka ASC
)
go

/*==============================================================*/
/* Index: DRZAVA_CLANICA_FK                                     */
/*==============================================================*/
create index DRZAVA_CLANICA_FK on "Sastav drava" (
Dr_Oznaka ASC
)
go

/*==============================================================*/
/* Table: "Sastav regiona"                                      */
/*==============================================================*/
create table "Sastav regiona" (
   Reg_Oznaka           char(1)              not null,
   "Reg_Oznaka regiona" smallint             not null,
   Oznaka               char(1)              not null,
   "Oznaka regiona"     smallint             not null,
   constraint "PK_SASTAV REGIONA" primary key (Reg_Oznaka, "Reg_Oznaka regiona", Oznaka, "Oznaka regiona")
)
go

/*==============================================================*/
/* Index: SASTAV_REGIONA_FK                                     */
/*==============================================================*/
create index SASTAV_REGIONA_FK on "Sastav regiona" (
Reg_Oznaka ASC,
"Reg_Oznaka regiona" ASC
)
go

/*==============================================================*/
/* Index: SASTAV_REGIONA2_FK                                    */
/*==============================================================*/
create index SASTAV_REGIONA2_FK on "Sastav regiona" (
Oznaka ASC,
"Oznaka regiona" ASC
)
go

/*==============================================================*/
/* Table: "Sistem ili podsistem"                                */
/*==============================================================*/
create table "Sistem ili podsistem" (
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Identifikator        bigint               not null,
   Naziv                varchar(120)         not null,
   Kod                  varchar(30)          not null,
   constraint "PK_SISTEM ILI PODSISTEM" primary key (Dr_Oznaka, Poslovni_sistem_Identifikator, Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Sistem ili podsistem"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Sistem ili podsistem', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Sistem ili podsistem', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: RESURSI_POSLOVNOG_SISTEMA3_FK                         */
/*==============================================================*/
create index RESURSI_POSLOVNOG_SISTEMA3_FK on "Sistem ili podsistem" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC
)
go

/*==============================================================*/
/* Table: Sistematizacija                                       */
/*==============================================================*/
create table Sistematizacija (
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Sistematizacija_Identifikator int                  not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   constraint PK_SISTEMATIZACIJA primary key (Dr_Oznaka, Poslovni_sistem_Identifikator, Sistematizacija_Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('Sistematizacija')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Sistematizacija', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Sistematizacija', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: SISTEMATIZACIJA_POSLOVNOG_SISTEMA_FK                  */
/*==============================================================*/
create index SISTEMATIZACIJA_POSLOVNOG_SISTEMA_FK on Sistematizacija (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC
)
go

/*==============================================================*/
/* Table: "Sloena organizaciona jedinica"                      */
/*==============================================================*/
create table "Sloena organizaciona jedinica" (
   Org_Dr_Oznaka       char(3)              not null,
   Org_Poslovni_sistem_Identifikator bigint               not null,
   Org_Organizaciona_Jedinica_Identifikator numeric(4)           not null,
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Organizaciona_Jedinica_Identifikator numeric(4)           not null,
   constraint "PK_SLOENA ORGANIZACIONA JEDIN" primary key (Org_Dr_Oznaka, Org_Poslovni_sistem_Identifikator, Org_Organizaciona_Jedinica_Identifikator, Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Sloena organizaciona jedinica"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Org_Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Sloena organizaciona jedinica', 'column', 'Org_Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Sloena organizaciona jedinica', 'column', 'Org_Dr_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Sloena organizaciona jedinica"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Sloena organizaciona jedinica', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Sloena organizaciona jedinica', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: SLOZENA_ORGANIZACIONA_JEDINICA_FK                     */
/*==============================================================*/
create index SLOZENA_ORGANIZACIONA_JEDINICA_FK on "Sloena organizaciona jedinica" (
Org_Dr_Oznaka ASC,
Org_Poslovni_sistem_Identifikator ASC,
Org_Organizaciona_Jedinica_Identifikator ASC
)
go

/*==============================================================*/
/* Index: SLOZENA_ORGANIZACIONA_JEDINICA2_FK                    */
/*==============================================================*/
create index SLOZENA_ORGANIZACIONA_JEDINICA2_FK on "Sloena organizaciona jedinica" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
Organizaciona_Jedinica_Identifikator ASC
)
go

/*==============================================================*/
/* Table: "Sloeni poslovni sistem"                             */
/*==============================================================*/
create table "Sloeni poslovni sistem" (
   Pos_Dr_Oznaka       char(3)              not null,
   Pos_Poslovni_sistem_Identifikator bigint               not null,
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   "Redni broj"         numeric(1)           not null,
   Oznaka               char(1)              not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   constraint "PK_SLOENI POSLOVNI SISTEM" primary key (Pos_Dr_Oznaka, Pos_Poslovni_sistem_Identifikator, Dr_Oznaka, Poslovni_sistem_Identifikator, "Redni broj")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Sloeni poslovni sistem"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Pos_Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Sloeni poslovni sistem', 'column', 'Pos_Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Sloeni poslovni sistem', 'column', 'Pos_Dr_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Sloeni poslovni sistem"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Sloeni poslovni sistem', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Sloeni poslovni sistem', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: MATICNI_POSLOVNI_SISTEM_FK                            */
/*==============================================================*/
create index MATICNI_POSLOVNI_SISTEM_FK on "Sloeni poslovni sistem" (
Pos_Dr_Oznaka ASC,
Pos_Poslovni_sistem_Identifikator ASC
)
go

/*==============================================================*/
/* Index: SISTEM_U_SASTAVU_FK                                   */
/*==============================================================*/
create index SISTEM_U_SASTAVU_FK on "Sloeni poslovni sistem" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC
)
go

/*==============================================================*/
/* Index: TIPIZACIJA_SLOZENOG_POSLOVNOG_SISTEMA_FK              */
/*==============================================================*/
create index TIPIZACIJA_SLOZENOG_POSLOVNOG_SISTEMA_FK on "Sloeni poslovni sistem" (
Oznaka ASC
)
go

/*==============================================================*/
/* Table: "Status deklaracije"                                  */
/*==============================================================*/
create table "Status deklaracije" (
   Status_Deklaracije_Identifikator varchar(10)          not null,
   Status_Deklaracije   varchar(100)         not null,
   constraint "PK_STATUS DEKLARACIJE" primary key (Status_Deklaracije_Identifikator)
)
go

/*==============================================================*/
/* Table: "Status posiljke"                                     */
/*==============================================================*/
create table "Status posiljke" (
   Status_Posiljke_Oznaka varchar(10)          not null,
   Status_Posiljke      varchar(200)         not null,
   constraint "PK_STATUS POSILJKE" primary key (Status_Posiljke_Oznaka)
)
go

/*==============================================================*/
/* Table: "Status reklamacije"                                  */
/*==============================================================*/
create table "Status reklamacije" (
   Status_Reklamacije_Oznaka varchar(10)          not null,
   Status               varchar(100)         not null,
   constraint "PK_STATUS REKLAMACIJE" primary key (Status_Reklamacije_Oznaka)
)
go

/*==============================================================*/
/* Table: "Struktura atributa"                                  */
/*==============================================================*/
create table "Struktura atributa" (
   Atr_Dr_Oznaka       char(3)              not null,
   Atr_Poslovni_sistem_Identifikator bigint               not null,
   Atr_Identifikator    bigint               not null,
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Identifikator        bigint               not null,
   constraint "PK_STRUKTURA ATRIBUTA" primary key (Atr_Dr_Oznaka, Atr_Poslovni_sistem_Identifikator, Atr_Identifikator, Dr_Oznaka, Poslovni_sistem_Identifikator, Identifikator)
)
go

/*==============================================================*/
/* Index: STRUKTURA_ATRIBUTA_FK                                 */
/*==============================================================*/
create index STRUKTURA_ATRIBUTA_FK on "Struktura atributa" (
Atr_Dr_Oznaka ASC,
Atr_Poslovni_sistem_Identifikator ASC,
Atr_Identifikator ASC
)
go

/*==============================================================*/
/* Index: STRUKTURA_ATRIBUTA2_FK                                */
/*==============================================================*/
create index STRUKTURA_ATRIBUTA2_FK on "Struktura atributa" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
Identifikator ASC
)
go

/*==============================================================*/
/* Table: Tabela                                                */
/*==============================================================*/
create table Tabela (
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Identifikator        bigint               not null,
   Naziv                varchar(120)         not null,
   Kod                  varchar(30)          not null,
   constraint PK_TABELA primary key (Dr_Oznaka, Poslovni_sistem_Identifikator, Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('Tabela')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Tabela', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Tabela', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: RESURSI_POSLOVNOG_SISTEMA_FK                          */
/*==============================================================*/
create index RESURSI_POSLOVNOG_SISTEMA_FK on Tabela (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC
)
go

/*==============================================================*/
/* Table: "Tip deklaracije"                                     */
/*==============================================================*/
create table "Tip deklaracije" (
   Status_deklaracije_Oznaka varchar(10)          not null,
   Tip_Deklaracije      varchar(100)         not null,
   constraint "PK_TIP DEKLARACIJE" primary key (Status_deklaracije_Oznaka)
)
go

/*==============================================================*/
/* Table: "Tip klijenta"                                        */
/*==============================================================*/
create table "Tip klijenta" (
   Tip_Klijenta_Oznaka  int                  not null,
   Tip_Klijenta         varchar(3)           not null,
   constraint "PK_TIP KLIJENTA" primary key (Tip_Klijenta_Oznaka)
)
go

/*==============================================================*/
/* Table: "Tip organizacione jedinice"                          */
/*==============================================================*/
create table "Tip organizacione jedinice" (
   Oznaka               char(1)              not null,
   Naziv                varchar(120)         not null,
   Opis                 varchar(256)         null,
   constraint "PK_TIP ORGANIZACIONE JEDINICE" primary key (Oznaka)
)
go

/*==============================================================*/
/* Table: "Tip posiljke"                                        */
/*==============================================================*/
create table "Tip posiljke" (
   Tip_Posiljke_Oznaka  varchar(10)          not null,
   Tip_Posiljke         varchar(50)          not null,
   constraint "PK_TIP POSILJKE" primary key (Tip_Posiljke_Oznaka)
)
go

/*==============================================================*/
/* Table: "Tip poslovnog sistema"                               */
/*==============================================================*/
create table "Tip poslovnog sistema" (
   Oznaka               char(1)              not null,
   Naziv                varchar(120)         not null,
   Opis                 varchar(256)         null,
   constraint "PK_TIP POSLOVNOG SISTEMA" primary key (Oznaka)
)
go

/*==============================================================*/
/* Table: "Tip regiona"                                         */
/*==============================================================*/
create table "Tip regiona" (
   Oznaka               char(1)              not null,
   Naziv                varchar(120)         not null,
   Opis                 varchar(265)         null,
   constraint "PK_TIP REGIONA" primary key (Oznaka)
)
go

/*==============================================================*/
/* Table: "Tip reklamacije"                                     */
/*==============================================================*/
create table "Tip reklamacije" (
   Tip_Reklamacije_Oznaka varchar(10)          not null,
   Tip_Reklamacije      varchar(50)          not null,
   constraint "PK_TIP REKLAMACIJE" primary key (Tip_Reklamacije_Oznaka)
)
go

/*==============================================================*/
/* Table: "Tip sloenog poslovnog sistema"                      */
/*==============================================================*/
create table "Tip sloenog poslovnog sistema" (
   Oznaka               char(1)              not null,
   Naziv                varchar(120)         not null,
   Opis                 varchar(256)         null,
   constraint "PK_TIP SLOENOG POSLOVNOG SIST" primary key (Oznaka)
)
go

/*==============================================================*/
/* Table: "Tip transporta"                                      */
/*==============================================================*/
create table "Tip transporta" (
   Tip_Transporta_Oznaka varchar(10)          not null,
   Tip_Transporta       varchar(50)          not null,
   constraint "PK_TIP TRANSPORTA" primary key (Tip_Transporta_Oznaka)
)
go

/*==============================================================*/
/* Table: "Tip vozila"                                          */
/*==============================================================*/
create table "Tip vozila" (
   Tip_Vozila_Oznaka    varchar(10)          not null,
   Naziv_Tipa           varchar(50)          not null,
   Opis                 varchar(200)         null,
   Nosivost             int                  not null,
   constraint "PK_TIP VOZILA" primary key (Tip_Vozila_Oznaka)
)
go

/*==============================================================*/
/* Table: "Ugovor o transportu"                                 */
/*==============================================================*/
create table "Ugovor o transportu" (
   Nalogodavac_Identifikator numeric(4)           not null,
   Ugovor_O_Transportu_Identifikator varchar(10)          not null,
   "Klije.nt_Identofokator" varchar(10)          not null,
   Dr_Oznaka           char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Datum_Potpisivanja   datetime             not null,
   Troskovi_Transporta  decimal(6,2)         not null,
   constraint "PK_UGOVOR O TRANSPORTU" primary key (Ugovor_O_Transportu_Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Ugovor o transportu"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Ugovor o transportu', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Ugovor o transportu', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: ODGOVORNO_PRAVNO_LICE_FK                              */
/*==============================================================*/
create index ODGOVORNO_PRAVNO_LICE_FK on "Ugovor o transportu" (
Dr_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
Nalogodavac_Identifikator ASC
)
go

/*==============================================================*/
/* Index: POSILJALAC2_FK                                        */
/*==============================================================*/
create index POSILJALAC2_FK on "Ugovor o transportu" (
"Klije.nt_Identofokator" ASC
)
go

/*==============================================================*/
/* Index: PRIMALAC2_FK                                          */
/*==============================================================*/
create index PRIMALAC2_FK on "Ugovor o transportu" (
"Klije.nt_Identofokator" ASC
)
go

/*==============================================================*/
/* Table: Vozilo                                                */
/*==============================================================*/
create table Vozilo (
   Tip_Transporta_Oznaka varchar(10)          not null,
   Tip_Vozila_Oznaka    varchar(10)          not null,
   Vozilo_Identifikator int                  not null,
   Marka                varchar(50)          not null,
   Proizvodjac          varchar(50)          not null,
   Kapacitet_Tereta     int                  not null,
   "Registarska _Oznaka" varchar(10)          null,
   Godina_Proizvodje    int                  not null,
   Ispravan             bit                  null,
   constraint PK_VOZILO primary key (Tip_Vozila_Oznaka, Vozilo_Identifikator)
)
go

/*==============================================================*/
/* Index: TIP_VOZILA_FK                                         */
/*==============================================================*/
create index TIP_VOZILA_FK on Vozilo (
Tip_Vozila_Oznaka ASC
)
go

/*==============================================================*/
/* Index: TIP_TRANSPORTA_VOZILA_FK                              */
/*==============================================================*/
create index TIP_TRANSPORTA_VOZILA_FK on Vozilo (
Tip_Transporta_Oznaka ASC
)
go

/*==============================================================*/
/* Table: "Vrsta radnog odnosa"                                 */
/*==============================================================*/
create table "Vrsta radnog odnosa" (
   Oznaka               char(2)              not null,
   Naziv                varchar(120)         not null,
   Opis                 varchar(256)         null,
   constraint "PK_VRSTA RADNOG ODNOSA" primary key (Oznaka)
)
go

/*==============================================================*/
/* Table: "Zaduzenje vozila"                                    */
/*==============================================================*/
create table "Zaduzenje vozila" (
   Vozilo_Identifikator int                  not null,
   Tip_Vozila_Oznaka    varchar(10)          not null,
   Drzava_Zaposlenog_Oznaka char(3)              not null,
   Poslovni_sistem_Identifikator bigint               not null,
   Redni_Broj_Evidencije_Zaposlenih int                  not null,
   Zaduzenje_Vozila_Identifikator int                  not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   constraint "PK_ZADUZENJE VOZILA" primary key (Tip_Vozila_Oznaka, Vozilo_Identifikator, Drzava_Zaposlenog_Oznaka, Poslovni_sistem_Identifikator, Redni_Broj_Evidencije_Zaposlenih, Zaduzenje_Vozila_Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Zaduzenje vozila"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava_Zaposlenog_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'user', @CurrentUser, 'table', 'Zaduzenje vozila', 'column', 'Drzava_Zaposlenog_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'user', @CurrentUser, 'table', 'Zaduzenje vozila', 'column', 'Drzava_Zaposlenog_Oznaka'
go

/*==============================================================*/
/* Index: VOZILO_ZADUZENO_FK                                    */
/*==============================================================*/
create index VOZILO_ZADUZENO_FK on "Zaduzenje vozila" (
Tip_Vozila_Oznaka ASC,
Vozilo_Identifikator ASC
)
go

/*==============================================================*/
/* Index: ZADUZUJE_VOZILO_FK                                    */
/*==============================================================*/
create index ZADUZUJE_VOZILO_FK on "Zaduzenje vozila" (
Drzava_Zaposlenog_Oznaka ASC,
Poslovni_sistem_Identifikator ASC,
Redni_Broj_Evidencije_Zaposlenih ASC
)
go

/*==============================================================*/
/* Table: "Školska sprema"                                      */
/*==============================================================*/
create table "Školska sprema" (
   Stepen               numeric(1)           not null,
   "Nivo obrazovanja"   smallint             not null,
   Oznaka               char(2)              not null,
   Naziv                varchar(120)         not null,
   Opis                 varchar(256)         null,
   constraint "PK_ŠKOLSKA SPREMA" primary key (Stepen, "Nivo obrazovanja", Oznaka)
)
go

/*==============================================================*/
/* Index: KOJE_SKOLSKE_SPREME_FK                                */
/*==============================================================*/
create index KOJE_SKOLSKE_SPREME_FK on "Školska sprema" (
Stepen ASC,
"Nivo obrazovanja" ASC
)
go

alter table "Adresni podaci"
   add constraint "FK_ADRESNI _KOD DRUGO_POSLOVNI" foreign key (Pos_Dr_Oznaka, Pos_Poslovni_sistem_Identifikator)
      references "Poslovni sistem" (Dr_Oznaka, Poslovni_sistem_Identifikator)
go

alter table "Adresni podaci"
   add constraint "FK_ADRESNI _KONTAKT P_REGISTAR" foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator, Redni_Broj_Evidencije_Zaposlenih)
      references "Registar zaposlenih" (Dr_Oznaka, Poslovni_sistem_Identifikator, Redni_Broj_Evidencije_Zaposlenih)
go

alter table "Adresni podaci"
   add constraint "FK_ADRESNI _MJESTO AD_NASELJEN" foreign key (Oznaka, Naseljeno_mjesto_Identifikator)
      references "Naseljeno mjesto" (Oznaka, Naseljeno_mjesto_Identifikator)
go

alter table Adresnica
   add constraint "FK_ADRESNIC_NACIN PLA_NACIN PL" foreign key (Nacin_Placanja_Oznaka)
      references "Nacin placanja posiljke" (Nacin_Placanja_Oznaka)
go

alter table Adresnica
   add constraint "FK_ADRESNIC_NACIN PRE_NACIN PR" foreign key (Nacin_Preuzimanja_Oznaka)
      references "Nacin preuzimanja" (Nacin_Preuzimanja_Oznaka)
go

alter table Adresnica
   add constraint "FK_ADRESNIC_OBRAZAC A_POSILJKA" foreign key (Posiljka_Identifikator)
      references Posiljka (Posiljka_Identifikator)
go

alter table Adresnica
   add constraint FK_ADRESNIC_POSILJALA_KLIJENT foreign key ("Kli_Klije.nt_Identofokator")
      references Klijent ("Klije.nt_Identofokator")
go

alter table Adresnica
   add constraint FK_ADRESNIC_PRIMALAC_KLIJENT foreign key ("Klije.nt_Identofokator")
      references Klijent ("Klije.nt_Identofokator")
go

alter table "Aktivne posiljke"
   add constraint "FK_AKTIVNE _JEDINICA _ORGANIZA" foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator)
      references "Organizaciona jedinica" (Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator)
go

alter table "Aktivne posiljke"
   add constraint "FK_AKTIVNE _POSILJKA _POSILJKA" foreign key (Posiljka_Identifikator)
      references Posiljka (Posiljka_Identifikator)
go

alter table Atribut
   add constraint "FK_ATRIBUT_RESURSI P_POSLOVNI" foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator)
      references "Poslovni sistem" (Dr_Oznaka, Poslovni_sistem_Identifikator)
go

alter table "Carinska deklaracija"
   add constraint FK_CARINSKA_DEKLARACI_CARINSKA foreign key (Carinska_Dokumentacija_Identifikator)
      references "Carinska dokumentacija" (Carinska_Dokumentacija_Identifikator)
go

alter table "Carinska deklaracija"
   add constraint FK_CARINSKA_NALOGODAV_ORGANIZA foreign key (Drzava_Jedinica_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator)
      references "Organizaciona jedinica" (Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator)
go

alter table "Carinska deklaracija"
   add constraint "FK_CARINSKA_PREDMET D_POSILJKA" foreign key (Posiljka_Identifikator)
      references Posiljka (Posiljka_Identifikator)
go

alter table "Carinska deklaracija"
   add constraint "FK_CARINSKA_STATUS DE_STATUS D" foreign key (Status_Deklaracije_Identifikator)
      references "Status deklaracije" (Status_Deklaracije_Identifikator)
go

alter table "Carinska deklaracija"
   add constraint "FK_CARINSKA_TIP DEKLA_TIP DEKL" foreign key (Status_deklaracije_Oznaka)
      references "Tip deklaracije" (Status_deklaracije_Oznaka)
go

alter table "Carinska dokumentacija"
   add constraint "FK_CARINSKA_MJESTO DO_NASELJEN" foreign key (Mjesto_Dostave_Oznaka, Naseljeno_mjesto_Identifikator)
      references "Naseljeno mjesto" (Oznaka, Naseljeno_mjesto_Identifikator)
go

alter table "Carinska dokumentacija"
   add constraint FK_CARINSKA_VOZAC_REGISTAR foreign key (Drzava_Vozac_Oznaka, Poslovni_sistem_Identifikator, Redni_Broj_Evidencije_Zaposlenih)
      references "Registar zaposlenih" (Dr_Oznaka, Poslovni_sistem_Identifikator, Redni_Broj_Evidencije_Zaposlenih)
go

alter table "Carinska dokumentacija"
   add constraint FK_CARINSKA_VOZILO_VOZILO foreign key (Tip_Vozila_Oznaka, Vozilo_Identifikator)
      references Vozilo (Tip_Vozila_Oznaka, Vozilo_Identifikator)
go

alter table Drzava
   add constraint "FK_DRZAVA_AKTUELNI _NASELJEN" foreign key (Nas_Oznaka, Naseljeno_mjesto_Identifikator)
      references "Naseljeno mjesto" (Oznaka, Naseljeno_mjesto_Identifikator)
go

alter table Drzava
   add constraint "FK_DRZAVA_TEKUCE UR_DRAVNO" foreign key (Onaka)
      references "Dravno uredenje" (Onaka)
go

alter table Dravljanstvo
   add constraint FK_DRAVLJA_DRAVLJAN_REGISTAR foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator, Redni_Broj_Evidencije_Zaposlenih)
      references "Registar zaposlenih" (Dr_Oznaka, Poslovni_sistem_Identifikator, Redni_Broj_Evidencije_Zaposlenih)
go

alter table Dravljanstvo
   add constraint FK_DRAVLJA_DRAVLJAN_DRZAVA foreign key (Oznaka)
      references Drzava (Oznaka)
go

alter table "Evidencija posiljki"
   add constraint FK_EVIDENCI_EVIDENCIJ_POSILJKA foreign key (Posiljka_Identifikator)
      references Posiljka (Posiljka_Identifikator)
go

alter table "Evidencija posiljki"
   add constraint "FK_EVIDENCI_SADRZI PO_ORGANIZA" foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator)
      references "Organizaciona jedinica" (Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator)
go

alter table "Evidencija reklamacija"
   add constraint "FK_EVIDENCI_ISTORIJA _STATUS R" foreign key (Status_Reklamacije_Oznaka)
      references "Status reklamacije" (Status_Reklamacije_Oznaka)
go

alter table "Evidencija reklamacija"
   add constraint "FK_EVIDENCI_PREDMET R_POSILJKA" foreign key (Posiljka_Identifikator)
      references Posiljka (Posiljka_Identifikator)
go

alter table "Evidencija reklamacija"
   add constraint FK_EVIDENCI_REKLAMACI_ORGANIZA foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator)
      references "Organizaciona jedinica" (Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator)
go

alter table "Evidencija reklamacija"
   add constraint "FK_EVIDENCI_SVRHA REK_TIP REKL" foreign key (Tip_Reklamacije_Oznaka)
      references "Tip reklamacije" (Tip_Reklamacije_Oznaka)
go

alter table "Flota vozila"
   add constraint "FK_FLOTA VO_FLOTA VOZ_ORGANIZA" foreign key (Drzava_Jedinice_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator)
      references "Organizaciona jedinica" (Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator)
go

alter table "Flota vozila"
   add constraint "FK_FLOTA VO_VOZILO U _VOZILO" foreign key (Tip_Vozila_Oznaka, Vozilo_Identifikator)
      references Vozilo (Tip_Vozila_Oznaka, Vozilo_Identifikator)
go

alter table "Glavni grad"
   add constraint "FK_GLAVNI G_GLAVNI GR_DRZAVA" foreign key (Dr_Oznaka)
      references Drzava (Oznaka)
go

alter table "Glavni grad"
   add constraint "FK_GLAVNI G_GLAVNI GR_NASELJEN" foreign key (Oznaka, Naseljeno_mjesto_Identifikator)
      references "Naseljeno mjesto" (Oznaka, Naseljeno_mjesto_Identifikator)
go

alter table "Istorija adresnice"
   add constraint "FK_ISTORIJA_OBRAZAC A_ADRESNIC" foreign key (Adresnica_Identifikator)
      references Adresnica (Adresnica_Identifikator)
go

alter table "Istorija adresnice"
   add constraint FK_ISTORIJA_POSILJKA_POSILJKA foreign key (Posiljka_Identifikator)
      references Posiljka (Posiljka_Identifikator)
go

alter table "Istorija adresnice"
   add constraint "FK_ISTORIJA_ADRESNICE _ZAPOSLENI" foreign key (Drzava_Zaposlenog_Oznaka, Poslovni_Sistem_Identifikator, Redni_Broj_Evidencije_Zaposlenih)
      references "Registar zaposlenih" (Dr_Oznaka, Poslovni_sistem_Identifikator, Redni_Broj_Evidencije_Zaposlenih)
go

alter table "Istorija akcija"
   add constraint "FK_ISTORIJA_AKCIJA NA_TABELA" foreign key (Tab_Dr_Oznaka, Tab_Poslovni_sistem_Identifikator, Identifikator)
      references Tabela (Dr_Oznaka, Poslovni_sistem_Identifikator, Identifikator)
go

alter table "Istorija akcija"
   add constraint "FK_ISTORIJA_AKCIJA _KORISNIK" foreign key (Pos_Dr_Oznaka, Pos_Poslovni_sistem_Identifikator, "User ID")
      references "Korisnicki nalog" (Pos_Dr_Oznaka, Pos_Poslovni_sistem_Identifikator, "User ID")
go

alter table "Istorija akcija"
   add constraint "FK_ISTORIJA_ISTORIJA _ORGANIZA" foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator)
      references "Organizaciona jedinica" (Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator)
go

alter table "Istorija deklaracije"
   add constraint "FK_ISTORIJA_CARINSKA _CARINSKA" foreign key (Carinska_Deklaracija_Identifikator)
      references "Carinska deklaracija" (Carinska_Deklaracija_Identifikator)
go

alter table "Istorija deklaracije"
   add constraint "FK_ISTORIJA_ISTORIJA _STATUS D" foreign key (Status_Deklaracije_Identifikator)
      references "Status deklaracije" (Status_Deklaracije_Identifikator)
go

alter table "Istorija deklaracije"
   add constraint FK_ISTORIJA_DEKLARACIJE_ZAPOSLENI foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator, Redni_Broj_Evidencije_Zaposlenih)
      references "Registar zaposlenih" (Dr_Oznaka, Poslovni_sistem_Identifikator, Redni_Broj_Evidencije_Zaposlenih)
go

alter table "Istorija izmjena"
   add constraint "FK_ISTORIJA_IZMJENA _KORISNIK" foreign key (Pos_Dr_Oznaka, Pos_Poslovni_sistem_Identifikator, "User ID")
      references "Korisnicki nalog" (Pos_Dr_Oznaka, Pos_Poslovni_sistem_Identifikator, "User ID")
go

alter table "Istorija izmjena"
   add constraint "FK_ISTORIJA_IZMJENA U_ORGANIZA" foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator)
      references "Organizaciona jedinica" (Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator)
go

alter table "Istorija izmjena"
   add constraint "FK_ISTORIJA_IZMJENE N_TABELA" foreign key (Tab_Dr_Oznaka, Tab_Poslovni_sistem_Identifikator, Identifikator)
      references Tabela (Dr_Oznaka, Poslovni_sistem_Identifikator, Identifikator)
go

alter table "Istorija logova pristupa"
   add constraint "FK_ISTORIJA_PRIJAVA K_KORISNIC" foreign key (Pos_Dr_Oznaka, Pos_Poslovni_sistem_Identifikator, "User ID")
      references "Korisnicki nalog" (Pos_Dr_Oznaka, Pos_Poslovni_sistem_Identifikator, "User ID")
go

alter table "Istorija logova pristupa"
   add constraint "FK_ISTORIJA_PRIJAVA N_SISTEM I" foreign key (Sis_Dr_Oznaka, Sis_Poslovni_sistem_Identifikator, Identifikator)
      references "Sistem ili podsistem" (Dr_Oznaka, Poslovni_sistem_Identifikator, Identifikator)
go

alter table "Istorija logova pristupa"
   add constraint "FK_ISTORIJA_PRIJAVA U_ORGANIZA" foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator)
      references "Organizaciona jedinica" (Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator)
go

alter table "Istorija odrzavanja"
   add constraint "FK_ODRZAVANJE_ISTORIJA _ODRZAVANJA" foreign key (Odrzavanje_Vozila_Identifikator)
      references "Odrzavanje vozila" (Odrzavanje_Vozila_Identifikator)
go

alter table "Istorija odrzavanja"
   add constraint FK_ISTORIJA_ODRZAVANJA_VOZILO foreign key (Tip_Vozila_Oznaka, Vozilo_Identifikator)
      references Vozilo (Tip_Vozila_Oznaka, Vozilo_Identifikator)
go

alter table "Istorija posiljke"
   add constraint "FK_ISTORIJA_ISTORIJA _STATUS P" foreign key (Status_Posiljke_Oznaka)
      references "Status posiljke" (Status_Posiljke_Oznaka)
go

alter table "Istorija posiljke"
   add constraint FK_ISTORIJA_PARAMETRI_POSILJKA foreign key (Posiljka_Identifikator)
      references Posiljka (Posiljka_Identifikator)
go

alter table "Istorija posiljke"
   add constraint "FK_ISTORIJA_POSILJKE _ZAPOSLENI" foreign key (Drzava_Zaposlenog_Oznaka, Poslovni_sistem_Identifikator, Redni_Broj_Evidencije_Zaposlenih)
      references "Registar zaposlenih" (Dr_Oznaka, Poslovni_sistem_Identifikator, Redni_Broj_Evidencije_Zaposlenih)
go

alter table "Istorija reklamacija"
   add constraint "FK_ISTORIJA_ISTORIJA _EVIDENCI" foreign key (Tip_Reklamacije_Oznaka, Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator, Posiljka_Identifikator)
      references "Evidencija reklamacija" (Tip_Reklamacije_Oznaka, Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator, Posiljka_Identifikator)
go

alter table "Istorija reklamacija"
   add constraint "FK_ISTORIJA_ISTORIJA _STATUS R" foreign key (Status_Reklamacije_Oznaka)
      references "Status reklamacije" (Status_Reklamacije_Oznaka)
go

alter table "Istorija reklamacija"
   add constraint FK_ISTORIJA_ZAPOSLENI_REGISTAR foreign key (Drzava_Zaposlenog_Oznaka, Poslovni_Sistem_Zaposlenog_Identifikator, Redni_Broj_Evidencije_Zaposlenih)
      references "Registar zaposlenih" (Dr_Oznaka, Poslovni_sistem_Identifikator, Redni_Broj_Evidencije_Zaposlenih)
go

alter table "Istorija transport posiljke"
   add constraint "FK_ISTORIJA_ISTORIJA _POSILJKA" foreign key (Posiljka_Identifikator)
      references Posiljka (Posiljka_Identifikator)
go

alter table "Istorija transport posiljke"
   add constraint "FK_ISTORIJA_ISTORIJA _VOZILO" foreign key (Tip_Vozila_Oznaka, Vozilo_Identifikator)
      references Vozilo (Tip_Vozila_Oznaka, Vozilo_Identifikator)
go

alter table "Istorija uredenja"
   add constraint "FK_ISTORIJA_KROZ ISTO_DRZAVA" foreign key (Oznaka)
      references Drzava (Oznaka)
go

alter table "Istorija uredenja"
   add constraint "FK_ISTORIJA_UREĞENJE _DRAVNO" foreign key (Onaka)
      references "Dravno uredenje" (Onaka)
go

alter table "Izabrani tipovi organizacione jedinice"
   add constraint "FK_IZABRANI_IZABRANA _TIP ORGA" foreign key (Oznaka)
      references "Tip organizacione jedinice" (Oznaka)
go

alter table "Izabrani tipovi organizacione jedinice"
   add constraint "FK_IZABRANI_IZBOR TIP_POSLOVNI" foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator)
      references "Poslovni sistem" (Dr_Oznaka, Poslovni_sistem_Identifikator)
go

alter table "Katalog radnih mjesta"
   add constraint "FK_KATALOG _IMA RADNA_POSLOVNI" foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator)
      references "Poslovni sistem" (Dr_Oznaka, Poslovni_sistem_Identifikator)
go

alter table "Katalog zanimanja"
   add constraint "FK_KATALOG _REGISTROV_DRZAVA" foreign key (Oznaka)
      references Drzava (Oznaka)
go

alter table "Katalog zvanja"
   add constraint "FK_KATALOG _KATALOG Z_DRZAVA" foreign key (Dr_Oznaka)
      references Drzava (Oznaka)
go

alter table Klijent
   add constraint "FK_KLIJENT_FIZICKO L_FIZICKO" foreign key (Fizicko_Lice_Identifikator)
      references "Fizicko lice" (Fizicko_Lice_Identifikator)
go

alter table Klijent
   add constraint "FK_KLIJENT_PRAVNO LI_PRAVNO L" foreign key (Pravno_Lice_Identifikator)
      references "Pravno lice" (Pravno_Lice_Identifikator)
go

alter table Klijent
   add constraint "FK_KLIJENT_TIP KLIJE_TIP KLIJ" foreign key (Tip_Klijenta_Oznaka)
      references "Tip klijenta" (Tip_Klijenta_Oznaka)
go

alter table "Korisnicki nalog"
   add constraint "FK_KORISNIC_NALOG ZAP_REGISTAR" foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator, Redni_Broj_Evidencije_Zaposlenih)
      references "Registar zaposlenih" (Dr_Oznaka, Poslovni_sistem_Identifikator, Redni_Broj_Evidencije_Zaposlenih)
go

alter table "Korisnicki nalog"
   add constraint FK_KORISNIC_REGISTROV_POSLOVNI foreign key (Pos_Dr_Oznaka, Pos_Poslovni_sistem_Identifikator)
      references "Poslovni sistem" (Dr_Oznaka, Poslovni_sistem_Identifikator)
go

alter table "Lista zvanja"
   add constraint "FK_LISTA ZV_LISTA ZVA_ŠKOLSKA" foreign key (Stepen, "Nivo obrazovanja", Ško_Oznaka)
      references "Školska sprema" (Stepen, "Nivo obrazovanja", Oznaka)
go

alter table "Lista zvanja"
   add constraint "FK_LISTA ZV_LISTA ZVA_KATALOG" foreign key (Dr_Oznaka, Oznaka)
      references "Katalog zvanja" (Dr_Oznaka, Oznaka)
go

alter table "Mjesna zajednica"
   add constraint "FK_MJESNA Z_IMA MJESN_OPŠTINA" foreign key (Oznaka, "Oznaka opštine")
      references Opština (Oznaka, "Oznaka opštine")
go

alter table "Mjesna zajednica"
   add constraint "FK_MJESNA Z_SJEDIŠTE _NASELJEN" foreign key (Nas_Oznaka, Naseljeno_mjesto_Identifikator)
      references "Naseljeno mjesto" (Oznaka, Naseljeno_mjesto_Identifikator)
go

alter table "Mjesno pokrivanje naselja"
   add constraint "FK_MJESNO P_MJESNO PO_MJESNA Z" foreign key (Mje_Oznaka, "Oznaka opštine", Identifikator)
      references "Mjesna zajednica" (Oznaka, "Oznaka opštine", Identifikator)
go

alter table "Mjesno pokrivanje naselja"
   add constraint "FK_MJESNO P_MJESNO PO_NASELJEN" foreign key (Oznaka, Naseljeno_mjesto_Identifikator)
      references "Naseljeno mjesto" (Oznaka, Naseljeno_mjesto_Identifikator)
go

alter table "Naseljeno mjesto"
   add constraint "FK_NASELJEN_SADRI NA_DRZAVA" foreign key (Oznaka)
      references Drzava (Oznaka)
go

alter table "Obrazuju za"
   add constraint "FK_OBRAZUJU_OBRAZUJU _ŠKOLSKA" foreign key (Stepen, "Nivo obrazovanja", Oznaka)
      references "Školska sprema" (Stepen, "Nivo obrazovanja", Oznaka)
go

alter table "Obrazuju za"
   add constraint "FK_OBRAZUJU_OBRAZUJU _POSLOVNI" foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator)
      references "Poslovni sistem" (Dr_Oznaka, Poslovni_sistem_Identifikator)
go

alter table "Obuhvata naselja"
   add constraint FK_OBUHVATA_NASELJENO_MJESTO foreign key (Nas_Oznaka, Naseljeno_mjesto_Identifikator)
      references "Naseljeno mjesto" (Oznaka, Naseljeno_mjesto_Identifikator)
go

alter table "Obuhvata naselja"
   add constraint "FK_OBUHVATA_OBUHVATA _REGION" foreign key (Oznaka, "Oznaka regiona")
      references Region (Oznaka, "Oznaka regiona")
go

alter table "Obuhvata opštine"
   add constraint "FK_OBUHVATA_OBUHVATA _OPŠTINA" foreign key (Opš_Oznaka, "Oznaka opštine")
      references Opština (Oznaka, "Oznaka opštine")
go

alter table "Obuhvata opštine"
   add constraint "FK_OBUHVATA_OBUHVATA _NASELJEN" foreign key (Oznaka, Naseljeno_mjesto_Identifikator)
      references "Naseljeno mjesto" (Oznaka, Naseljeno_mjesto_Identifikator)
go

alter table "Odnos radnih mjesta"
   add constraint "FK_ODNOS RA_NADREDJEN_KATALOG" foreign key (Kat_Dr_Oznaka, Kat_Poslovni_sistem_Identifikator, Katalog_radnih_mjesta_Oznaka)
      references "Katalog radnih mjesta" (Dr_Oznaka, Poslovni_sistem_Identifikator, Katalog_radnih_mjesta_Oznaka)
go

alter table "Odnos radnih mjesta"
   add constraint "FK_ODNOS RA_ODNOS RAD_SISTEMAT" foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator, Sistematizacija_Identifikator)
      references Sistematizacija (Dr_Oznaka, Poslovni_sistem_Identifikator, Sistematizacija_Identifikator)
go

alter table "Odnos radnih mjesta"
   add constraint "FK_ODNOS RA_PODREDJEN_KATALOG" foreign key (Kat_Dr_Oznaka2, Kat_Poslovni_sistem_Identifikator2, Kat_Katalog_radnih_mjesta_Oznaka)
      references "Katalog radnih mjesta" (Dr_Oznaka, Poslovni_sistem_Identifikator, Katalog_radnih_mjesta_Oznaka)
go

alter table "Odrzavanje vozila"
   add constraint "FK_ODRZAVANJE _VOZILO" foreign key (Tip_Vozila_Oznaka, Vozilo_Identifikator)
      references Vozilo (Tip_Vozila_Oznaka, Vozilo_Identifikator)
go

alter table Opština
   add constraint "FK_OPŠTINA_LOKALNA S_DRZAVA" foreign key (Oznaka)
      references Drzava (Oznaka)
go

alter table Opština
   add constraint "FK_OPŠTINA_SJEDIŠTE _NASELJEN" foreign key (Nas_Oznaka, Naseljeno_mjesto_Identifikator)
      references "Naseljeno mjesto" (Oznaka, Naseljeno_mjesto_Identifikator)
go

alter table "Organizaciona jedinica"
   add constraint "FK_ORGANIZA_SJEDIŠTE _NASELJEN" foreign key (Nas_Oznaka, Naseljeno_mjesto_Identifikator)
      references "Naseljeno mjesto" (Oznaka, Naseljeno_mjesto_Identifikator)
go

alter table "Organizaciona jedinica"
   add constraint FK_ORGANIZA_TIPIZACIJ_IZABRANI foreign key (Oznaka, Iza_Dr_Oznaka, Iza_Poslovni_sistem_Identifikator)
      references "Izabrani tipovi organizacione jedinice" (Oznaka, Dr_Oznaka, Poslovni_sistem_Identifikator)
go

alter table "Organizaciona jedinica"
   add constraint FK_ORGANIZA_UNUTRAŠNJ_POSLOVNI foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator)
      references "Poslovni sistem" (Dr_Oznaka, Poslovni_sistem_Identifikator)
go

alter table "Personalna restrikcija"
   add constraint FK_PERSONAL_PERSONALN_ATRIBUT foreign key (Atr_Dr_Oznaka, Atr_Poslovni_sistem_Identifikator, Atr_Identifikator)
      references Atribut (Dr_Oznaka, Poslovni_sistem_Identifikator, Identifikator)
go

alter table "Personalna restrikcija"
   add constraint FK_PERSONAL_PERSONALN_PRIPADA foreign key (Pos_Dr_Oznaka, Pos_Poslovni_sistem_Identifikator, "User ID", Dr_Oznaka, Poslovni_sistem_Identifikator, "Oznaka role", Identifikator)
      references "Pripada roli" (Pos_Dr_Oznaka, Pos_Poslovni_sistem_Identifikator, "User ID", Dr_Oznaka, Poslovni_sistem_Identifikator, "Oznaka role", Identifikator)
go

alter table "Personalna restrikcija"
   add constraint FK_PERSONAL_PERSONALN_TABELA foreign key (Tab_Dr_Oznaka, Tab_Poslovni_sistem_Identifikator, Tab_Identifikator)
      references Tabela (Dr_Oznaka, Poslovni_sistem_Identifikator, Identifikator)
go

alter table "Podaci o obrazovanju"
   add constraint "FK_PODACI O_OBRAZOVNA_POSLOVNI" foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator)
      references "Poslovni sistem" (Dr_Oznaka, Poslovni_sistem_Identifikator)
go

alter table "Podaci o obrazovanju"
   add constraint "FK_PODACI O_PODACI O _REGISTAR" foreign key (Reg_Dr_Oznaka, Reg_Poslovni_sistem_Identifikator, Redni_Broj_Evidencije_Zaposlenih)
      references "Registar zaposlenih" (Dr_Oznaka, Poslovni_sistem_Identifikator, Redni_Broj_Evidencije_Zaposlenih)
go

alter table "Podaci o obrazovanju"
   add constraint "FK_PODACI O_TIPIZACIJ_KATALOG" foreign key (Kat_Dr_Oznaka, Kat_Oznaka)
      references "Katalog zvanja" (Dr_Oznaka, Oznaka)
go

alter table "Podaci o obrazovanju"
   add constraint "FK_PODACI O_TIPIZACIJ_ŠKOLSKA" foreign key (Stepen, "Nivo obrazovanja", Oznaka)
      references "Školska sprema" (Stepen, "Nivo obrazovanja", Oznaka)
go

alter table Posiljka
   add constraint "FK_POSILJKA_MJESTO DO_NASELJEN" foreign key (Oznaka, Naseljeno_mjesto_Identifikator)
      references "Naseljeno mjesto" (Oznaka, Naseljeno_mjesto_Identifikator)
go

alter table Posiljka
   add constraint "FK_POSILJKA_PREDMET U_UGOVOR O" foreign key (Ugovor_O_Transportu_Identifikator)
      references "Ugovor o transportu" (Ugovor_O_Transportu_Identifikator)
go

alter table Posiljka
   add constraint "FK_POSILJKA_STATUS PO_STATUS P" foreign key (Status_Posiljke_Oznaka)
      references "Status posiljke" (Status_Posiljke_Oznaka)
go

alter table Posiljka
   add constraint "FK_POSILJKA_STATUS RE_STATUS R" foreign key (Status_Reklamacije_Oznaka)
      references "Status reklamacije" (Status_Reklamacije_Oznaka)
go

alter table Posiljka
   add constraint "FK_POSILJKA_TIP POSIL_TIP POSI" foreign key (Tip_Posiljke_Oznaka)
      references "Tip posiljke" (Tip_Posiljke_Oznaka)
go

alter table Posiljka
   add constraint "FK_POSILJKA_TIP TRANS_TIP TRAN" foreign key (Tip_Transporta_Oznaka)
      references "Tip transporta" (Tip_Transporta_Oznaka)
go

alter table "Posiljke u transportu"
   add constraint "FK_POSILJKE_POSILJKA _POSILJKA" foreign key (Posiljka_Identifikator)
      references Posiljka (Posiljka_Identifikator)
go

alter table "Posiljke u transportu"
   add constraint "FK_POSILJKE_VOZILO SA_VOZILO" foreign key (Tip_Vozila_Oznaka, Vozilo_Identifikator)
      references Vozilo (Tip_Vozila_Oznaka, Vozilo_Identifikator)
go

alter table "Poslovni sistem"
   add constraint "FK_POSLOVNI_DRZAVA PO_DRZAVA" foreign key (Dr_Oznaka)
      references Drzava (Oznaka)
go

alter table "Poslovni sistem"
   add constraint "FK_POSLOVNI_PRAVNI SL_POSLOVNI" foreign key (Pos_Dr_Oznaka, Pos_Poslovni_sistem_Identifikator)
      references "Poslovni sistem" (Dr_Oznaka, Poslovni_sistem_Identifikator)
go

alter table "Poslovni sistem"
   add constraint "FK_POSLOVNI_SJEDIŠTE _NASELJEN" foreign key (Nas_Oznaka, Naseljeno_mjesto_Identifikator)
      references "Naseljeno mjesto" (Oznaka, Naseljeno_mjesto_Identifikator)
go

alter table "Poslovni sistem"
   add constraint "FK_POSLOVNI_TIPIZACIJ_TIP POSL" foreign key (Oznaka)
      references "Tip poslovnog sistema" (Oznaka)
go

alter table "Potrebna školska sprema"
   add constraint "FK_POTREBNA_POTREBNA _KATALOG" foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator, Katalog_radnih_mjesta_Oznaka)
      references "Katalog radnih mjesta" (Dr_Oznaka, Poslovni_sistem_Identifikator, Katalog_radnih_mjesta_Oznaka)
go

alter table "Potrebna školska sprema"
   add constraint "FK_POTREBNA_POTREBNA _ŠKOLSKA" foreign key (Stepen, "Nivo obrazovanja", Oznaka)
      references "Školska sprema" (Stepen, "Nivo obrazovanja", Oznaka)
go

alter table "Potrebne spreme"
   add constraint "FK_POTREBNE_POTREBNE _ŠKOLSKA" foreign key (Stepen, "Nivo obrazovanja", Ško_Oznaka)
      references "Školska sprema" (Stepen, "Nivo obrazovanja", Oznaka)
go

alter table "Potrebne spreme"
   add constraint "FK_POTREBNE_POTREBNE _KATALOG" foreign key (Oznaka, Zanimanje)
      references "Katalog zanimanja" (Oznaka, Zanimanje)
go

alter table "Povezana sa"
   add constraint "FK_POVEZANA_SA _TABELOM" foreign key (Tab_Dr_Oznaka, Tab_Poslovni_sistem_Identifikator, Tab_Identifikator)
      references Tabela (Dr_Oznaka, Poslovni_sistem_Identifikator, Identifikator)
go

alter table "Povezana sa"
   add constraint FK_POVEZANA_TABELA foreign key (Tab_Dr_Oznaka, Tab_Poslovni_sistem_Identifikator, Tab_Identifikator)
      references Tabela (Dr_Oznaka, Poslovni_sistem_Identifikator, Identifikator)
go

alter table "Pravni nasljednik"
   add constraint "FK_PRAVNI NASLJEDNIK_DRZAVA" foreign key (Dr_Oznaka)
      references Drzava (Oznaka)
go

alter table "Pravni nasljednik"
   add constraint "FK_PRAVNI N_PRAVNI NA_DRZAVA" foreign key (Oznaka)
      references Drzava (Oznaka)
go

alter table "Pravo na podsistem"
   add constraint "FK_PRAVO NA_PRAVO NA _SISTEM I" foreign key (Sis_Dr_Oznaka, Sis_Poslovni_sistem_Identifikator, Identifikator)
      references "Sistem ili podsistem" (Dr_Oznaka, Poslovni_sistem_Identifikator, Identifikator)
go

alter table "Pravo na podsistem"
   add constraint "FK_PRAVO NA_PRAVO NA _ROLA" foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator, "Oznaka role")
      references Rola (Dr_Oznaka, Poslovni_sistem_Identifikator, "Oznaka role")
go

alter table "Predefinisane role radnih mjesta"
   add constraint FK_PREDEFIN_PREDEFINI_ROLA foreign key (Rol_Dr_Oznaka, Rol_Poslovni_sistem_Identifikator, "Oznaka role")
      references Rola (Dr_Oznaka, Poslovni_sistem_Identifikator, "Oznaka role")
go

alter table "Predefinisane role radnih mjesta"
   add constraint FK_PREDEFIN_PREDEFINI_KATALOG foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator, Katalog_radnih_mjesta_Oznaka)
      references "Katalog radnih mjesta" (Dr_Oznaka, Poslovni_sistem_Identifikator, Katalog_radnih_mjesta_Oznaka)
go

alter table "Pripada roli"
   add constraint "FK_PRIPADA _KO JE U G_ROLA" foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator, "Oznaka role")
      references Rola (Dr_Oznaka, Poslovni_sistem_Identifikator, "Oznaka role")
go

alter table "Pripada roli"
   add constraint "FK_PRIPADA _SVRSTAN U_KORISNIC" foreign key (Pos_Dr_Oznaka, Pos_Poslovni_sistem_Identifikator, "User ID")
      references "Korisnicki nalog" (Pos_Dr_Oznaka, Pos_Poslovni_sistem_Identifikator, "User ID")
go

alter table "Radna mjesta u Organizacionoj jedinici"
   add constraint "FK_RADNA MJ_ORGANIZAC_ORGANIZA" foreign key (Org_Dr_Oznaka, Org_Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator)
      references "Organizaciona jedinica" (Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator)
go

alter table "Radna mjesta u Organizacionoj jedinici"
   add constraint "FK_RADNA MJ_RADNO MJE_KATALOG" foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator, Katalog_radnih_mjesta_Oznaka)
      references "Katalog radnih mjesta" (Dr_Oznaka, Poslovni_sistem_Identifikator, Katalog_radnih_mjesta_Oznaka)
go

alter table "Raspored na radna mjesta"
   add constraint "FK_RASPORED_KADROVI U_ORGANIZA" foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator)
      references "Organizaciona jedinica" (Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator)
go

alter table "Raspored na radna mjesta"
   add constraint "FK_RASPORED_RASPORED _KATALOG" foreign key (Kat_Dr_Oznaka, Kat_Poslovni_sistem_Identifikator, Katalog_radnih_mjesta_Oznaka)
      references "Katalog radnih mjesta" (Dr_Oznaka, Poslovni_sistem_Identifikator, Katalog_radnih_mjesta_Oznaka)
go

alter table "Raspored na radna mjesta"
   add constraint "FK_RASPORED_RASPORED _REGISTAR" foreign key (Reg_Dr_Oznaka, Reg_Poslovni_sistem_Identifikator, Redni_Broj_Evidencije_Zaposlenih)
      references "Registar zaposlenih" (Dr_Oznaka, Poslovni_sistem_Identifikator, Redni_Broj_Evidencije_Zaposlenih)
go

alter table "Raspored na radna mjesta"
   add constraint "FK_RASPORED_TIPIZACIJ_VRSTA RA" foreign key (Oznaka)
      references "Vrsta radnog odnosa" (Oznaka)
go

alter table Region
   add constraint FK_REGION_ADMINISTR_NASELJEN foreign key (Nas_Oznaka, Naseljeno_mjesto_Identifikator)
      references "Naseljeno mjesto" (Oznaka, Naseljeno_mjesto_Identifikator)
go

alter table Region
   add constraint "FK_REGION_MATICNA D_DRZAVA" foreign key (Dr_Oznaka)
      references Drzava (Oznaka)
go

alter table Region
   add constraint "FK_REGION_TIPIZACIJ_TIP REGI" foreign key (Oznaka)
      references "Tip regiona" (Oznaka)
go

alter table "Registar zaposlenih"
   add constraint FK_REGISTAR_ZAPOŠLJAV_POSLOVNI foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator)
      references "Poslovni sistem" (Dr_Oznaka, Poslovni_sistem_Identifikator)
go

alter table "Restrikcija atributa"
   add constraint FK_RESTRIKCIJA_ROLA foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator, "Oznaka role")
      references Rola (Dr_Oznaka, Poslovni_sistem_Identifikator, "Oznaka role")
go

alter table "Restrikcija atributa"
   add constraint FK_RESTRIKC_RESTRIKCI_ATRIBUT foreign key (Atr_Dr_Oznaka, Atr_Poslovni_sistem_Identifikator, Identifikator)
      references Atribut (Dr_Oznaka, Poslovni_sistem_Identifikator, Identifikator)
go

alter table "Restrikcija nad tabelama"
   add constraint FK_RESTRIKCJA_NAD_ROLAMA foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator, "Oznaka role")
      references Rola (Dr_Oznaka, Poslovni_sistem_Identifikator, "Oznaka role")
go

alter table "Restrikcija nad tabelama"
   add constraint FK_RESTRIKC_RESTRIKCI_TABELA foreign key (Tab_Dr_Oznaka, Tab_Poslovni_sistem_Identifikator, Identifikator)
      references Tabela (Dr_Oznaka, Poslovni_sistem_Identifikator, Identifikator)
go

alter table Rola
   add constraint "FK_ROLA_ROLE POSL_POSLOVNI" foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator)
      references "Poslovni sistem" (Dr_Oznaka, Poslovni_sistem_Identifikator)
go

alter table "Sadri atribute"
   add constraint "FK_SADRI A_SADRI AT_ATRIBUT" foreign key (Atr_Dr_Oznaka, Poslovni_sistem_Identifikator, Atr_Identifikator)
      references Atribut (Dr_Oznaka, Poslovni_sistem_Identifikator, Identifikator)
go

alter table "Sadri atribute"
   add constraint "FK_SADRI A_SADRI AT_TABELA" foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator, Identifikator)
      references Tabela (Dr_Oznaka, Poslovni_sistem_Identifikator, Identifikator)
go

alter table "Sadri podsisteme"
   add constraint FK_SADRI_SISTEM_SISTEM_PODSISTEM foreign key (Sis_Dr_Oznaka, Sis_Poslovni_sistem_Identifikator, Sis_Identifikator)
      references "Sistem ili podsistem" (Dr_Oznaka, Poslovni_sistem_Identifikator, Identifikator)
go

alter table "Sadri podsisteme"
   add constraint "FK_SADRI P_SADRI PO_SISTEM I" foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator, Identifikator)
      references "Sistem ili podsistem" (Dr_Oznaka, Poslovni_sistem_Identifikator, Identifikator)
go

alter table "Sadri tabele"
   add constraint "FK_SADRI T_SADRI TA_TABELA" foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator, Tab_Identifikator)
      references Tabela (Dr_Oznaka, Poslovni_sistem_Identifikator, Identifikator)
go

alter table "Sadri tabele"
   add constraint "FK_SADRI T_SADRI TA_SISTEM I" foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator, Identifikator)
      references "Sistem ili podsistem" (Dr_Oznaka, Poslovni_sistem_Identifikator, Identifikator)
go

alter table "Sastav drava"
   add constraint "FK_SASTAV D_DRZAVA CL_DRZAVA" foreign key (Dr_Oznaka)
      references Drzava (Oznaka)
go

alter table "Sastav drava"
   add constraint "FK_SASTAV D_SLOENA D_DRZAVA" foreign key (Oznaka)
      references Drzava (Oznaka)
go

alter table "Sastav regiona"
   add constraint FK_SASTAV_REGIONA_REGION foreign key (Reg_Oznaka, "Reg_Oznaka regiona")
      references Region (Oznaka, "Oznaka regiona")
go

alter table "Sastav regiona"
   add constraint "FK_SASTAV R_SASTAV RE_REGION" foreign key (Oznaka, "Oznaka regiona")
      references Region (Oznaka, "Oznaka regiona")
go

alter table "Sistem ili podsistem"
   add constraint "FK_SISTEM I_RESURSI P_POSLOVNI" foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator)
      references "Poslovni sistem" (Dr_Oznaka, Poslovni_sistem_Identifikator)
go

alter table Sistematizacija
   add constraint FK_SISTEMAT_SISTEMATI_POSLOVNI foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator)
      references "Poslovni sistem" (Dr_Oznaka, Poslovni_sistem_Identifikator)
go

alter table "Sloena organizaciona jedinica"
   add constraint "FK_SLOENA _JEDINICA_ORGANIZACIONA_JEDINICA" foreign key (Org_Dr_Oznaka, Org_Poslovni_sistem_Identifikator, Org_Organizaciona_Jedinica_Identifikator)
      references "Organizaciona jedinica" (Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator)
go

alter table "Sloena organizaciona jedinica"
   add constraint "FK_SLOENA _SLOENA O_ORGANIZA" foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator)
      references "Organizaciona jedinica" (Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator)
go

alter table "Sloeni poslovni sistem"
   add constraint "FK_SLOENI _MATICNI P_POSLOVNI" foreign key (Pos_Dr_Oznaka, Pos_Poslovni_sistem_Identifikator)
      references "Poslovni sistem" (Dr_Oznaka, Poslovni_sistem_Identifikator)
go

alter table "Sloeni poslovni sistem"
   add constraint "FK_SLOENI _SISTEM U _POSLOVNI" foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator)
      references "Poslovni sistem" (Dr_Oznaka, Poslovni_sistem_Identifikator)
go

alter table "Sloeni poslovni sistem"
   add constraint "FK_SLOENI _TIPIZACIJ_TIP SLO" foreign key (Oznaka)
      references "Tip sloenog poslovnog sistema" (Oznaka)
go

alter table "Struktura atributa"
   add constraint FK_STRUKTURA_ATRIBUTA_ATRIBUT foreign key (Atr_Dr_Oznaka, Atr_Poslovni_sistem_Identifikator, Atr_Identifikator)
      references Atribut (Dr_Oznaka, Poslovni_sistem_Identifikator, Identifikator)
go

alter table "Struktura atributa"
   add constraint FK_STRUKTUR_STRUKTURA_ATRIBUT foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator, Identifikator)
      references Atribut (Dr_Oznaka, Poslovni_sistem_Identifikator, Identifikator)
go

alter table Tabela
   add constraint "FK_TABELA_RESURSI P_POSLOVNI" foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator)
      references "Poslovni sistem" (Dr_Oznaka, Poslovni_sistem_Identifikator)
go

alter table "Ugovor o transportu"
   add constraint "FK_UGOVOR O_ODGOVORNO_ORGANIZA" foreign key (Dr_Oznaka, Poslovni_sistem_Identifikator, Nalogodavac_Identifikator)
      references "Organizaciona jedinica" (Dr_Oznaka, Poslovni_sistem_Identifikator, Organizaciona_Jedinica_Identifikator)
go

alter table "Ugovor o transportu"
   add constraint "FK_UGOVOR O_POSILJALA_KLIJENT" foreign key ("Klije.nt_Identofokator")
      references Klijent ("Klije.nt_Identofokator")
go

alter table "Ugovor o transportu"
   add constraint "FK_UGOVOR O_PRIMALAC2_KLIJENT" foreign key ("Klije.nt_Identofokator")
      references Klijent ("Klije.nt_Identofokator")
go

alter table "Ugovor o transportu"
   add constraint "FK_UGOVOR O_STRANKA_KLIJENT" foreign key ("Klije.nt_Identofokator")
      references Klijent ("Klije.nt_Identofokator")
go

alter table Vozilo
   add constraint FK_VOZILO_TIP_VOZILA foreign key (Tip_Vozila_Oznaka)
      references "Tip vozila" (Tip_Vozila_Oznaka)
go

alter table Vozilo
   add constraint "FK_VOZILO_TIP TRANS_TIP TRAN" foreign key (Tip_Transporta_Oznaka)
      references "Tip transporta" (Tip_Transporta_Oznaka)
go

alter table "Zaduzenje vozila"
   add constraint FK_ZADUZENJ_VOZILA_VOZILO foreign key (Tip_Vozila_Oznaka, Vozilo_Identifikator)
      references Vozilo (Tip_Vozila_Oznaka, Vozilo_Identifikator)
go

alter table "Zaduzenje vozila"
   add constraint FK_ZADUZENJE_VOZILA_ZAPOSLENI foreign key (Drzava_Zaposlenog_Oznaka, Poslovni_sistem_Identifikator, Redni_Broj_Evidencije_Zaposlenih)
      references "Registar zaposlenih" (Dr_Oznaka, Poslovni_sistem_Identifikator, Redni_Broj_Evidencije_Zaposlenih)
go

alter table "Školska sprema"
   add constraint "FK_ŠKOLSKA _KOJE ŠKOL_NIVO OBR" foreign key (Stepen, "Nivo obrazovanja")
      references "Nivo obrazovanja" (Stepen, "Nivo obrazovanja")
go

