.class public final synthetic Lcom/android/camera/fragment/top/h;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private final synthetic wb:Lcom/android/camera/fragment/top/FragmentTopAlert;


# direct methods
.method public synthetic constructor <init>(Lcom/android/camera/fragment/top/FragmentTopAlert;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/camera/fragment/top/h;->wb:Lcom/android/camera/fragment/top/FragmentTopAlert;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p0, p0, Lcom/android/camera/fragment/top/h;->wb:Lcom/android/camera/fragment/top/FragmentTopAlert;

    invoke-virtual {p0, p1, p2}, Lcom/android/camera/fragment/top/FragmentTopAlert;->i(Landroid/content/DialogInterface;I)V

    return-void
.end method
