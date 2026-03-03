import random
import tkinter as tk
from tkinter import filedialog, messagebox

def dosya_yukle(text_widget):
    dosya = filedialog.askopenfilename(filetypes=[("Text Files", "*.txt")])
    if not dosya:
        return
    
    with open(dosya, "r", encoding="utf-8") as f:
        icerik = f.read()
    
    text_widget.delete("1.0", tk.END)
    text_widget.insert(tk.END, icerik)

def eslestir():
    grup1 = text1.get("1.0", tk.END).strip().split("\n")
    grup2 = text2.get("1.0", tk.END).strip().split("\n")

    grup1 = [x.strip() for x in grup1 if x.strip() != ""]
    grup2 = [x.strip() for x in grup2 if x.strip() != ""]

    if not grup1 or not grup2:
        messagebox.showerror("Hata", "İki grup da boş olamaz!")
        return

    random.shuffle(grup1)
    random.shuffle(grup2)

    min_len = min(len(grup1), len(grup2))

    sonuc_text.delete("1.0", tk.END)

    for i in range(min_len):
        sonuc_text.insert(tk.END, f"{grup1[i]}  →  {grup2[i]}\n")

def sonucu_kaydet():
    icerik = sonuc_text.get("1.0", tk.END).strip()

    if not icerik:
        messagebox.showwarning("Uyarı", "Kaydedilecek sonuç yok!")
        return

    dosya = filedialog.asksaveasfilename(
        defaultextension=".txt",
        filetypes=[("Text Files", "*.txt")],
        title="Sonucu Kaydet"
    )

    if not dosya:
        return

    with open(dosya, "w", encoding="utf-8") as f:
        f.write(icerik)

    messagebox.showinfo("Başarılı", "Sonuç başarıyla kaydedildi!")

def temizle():
    text1.delete("1.0", tk.END)
    text2.delete("1.0", tk.END)
    sonuc_text.delete("1.0", tk.END)

# Arayüz
root = tk.Tk()
root.title("Rastgele Eşleştirici")
root.geometry("700x650")

frame = tk.Frame(root)
frame.pack(pady=10)

# Grup 1
tk.Label(frame, text="Grup 1").grid(row=0, column=0)
text1 = tk.Text(frame, height=10, width=35)
text1.grid(row=1, column=0, padx=10)
tk.Button(frame, text="TXT Yükle", command=lambda: dosya_yukle(text1)).grid(row=2, column=0, pady=5)

# Grup 2
tk.Label(frame, text="Grup 2").grid(row=0, column=1)
text2 = tk.Text(frame, height=10, width=35)
text2.grid(row=1, column=1, padx=10)
tk.Button(frame, text="TXT Yükle", command=lambda: dosya_yukle(text2)).grid(row=2, column=1, pady=5)

# Butonlar
tk.Button(root, text="Rastgele Eşleştir", command=eslestir, height=2, width=25).pack(pady=10)
tk.Button(root, text="Sonucu Kaydet", command=sonucu_kaydet, height=2, width=25).pack(pady=5)
tk.Button(root, text="Temizle", command=temizle).pack(pady=5)

# Sonuç
tk.Label(root, text="Sonuç").pack(pady=5)
sonuc_text = tk.Text(root, height=15, width=80)
sonuc_text.pack()

root.mainloop()