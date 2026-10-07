# 📱 Práctica - Configuración de `themes.xml`

Este documento contiene la solución para configurar correctamente el archivo `themes.xml` en los diferentes proyectos de Android Studio.

---

## 🏥 1. Clínica Salud Plus

### Revisar `themes.xml`

En el panel izquierdo de Android Studio:

```text
res
└── values
    └── themes.xml
```

Abre el archivo `themes.xml` y verifica que contenga lo siguiente:

```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <style name="Theme.ClinicaSaludPlus" parent="android:Theme.Material.Light.NoActionBar" />
</resources>
```

---

## 🏋️ 2. TecsupFit

### Solución

Si el archivo `themes.xml` no existe:

1. Haz clic derecho sobre la carpeta `values`.
2. Selecciona **New → Values Resource File**.
3. Coloca como nombre:

```text
themes
```

4. Presiona **OK**.
5. Reemplaza el contenido del archivo por:

```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <style name="Theme.TecsupFit" parent="android:Theme.Material.Light.NoActionBar" />
</resources>
```

---

## 🛒 3. CarritoTecsup

Para el proyecto **CarritoTecsup**, el archivo `themes.xml` debe contener:

```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <style name="Theme.Lab04CarritoTecsup" parent="android:Theme.Material.Light.NoActionBar" />
</resources>
```

---

## 🏪 4. Mi Bodega

Para el proyecto **Mi Bodega**, el archivo `themes.xml` debe contener:

```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <style name="Theme.MiBodega" parent="android:Theme.Material.Light.NoActionBar" />
</resources>
```

---

## 📌 Resumen

| Proyecto | Nombre del Theme |
|---|---|
| 🏥 Clínica Salud Plus | `Theme.ClinicaSaludPlus` |
| 🏋️ TecsupFit | `Theme.TecsupFit` |
| 🛒 CarritoTecsup | `Theme.Lab04CarritoTecsup` |
| 🏪 Mi Bodega | `Theme.MiBodega` |

### 📂 Ubicación del archivo

En todos los proyectos, el archivo se encuentra en:

```text
app
└── src
    └── main
        └── res
            └── values
                └── themes.xml
```

> **Nota:** El nombre definido en `themes.xml` debe coincidir con el nombre del tema utilizado por el proyecto.
